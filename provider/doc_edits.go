// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package equinix

import (
	"regexp"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

// docEditRules rewrites upstream Terraform examples so that `pulumi convert` can translate them.
//
// When one example in a docs section fails to convert, the bridge drops every remaining example
// in that section, so a single unsupported construct can hide dozens of examples. These rules run
// before code translation, against the raw upstream markdown.
func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(defaults,
		// Module-relative paths can't be resolved by the converter
		replace("*", `\$\{path\.module\}/`, ""),

		// Placeholders that aren't valid HCL expressions
		replace("fabric_routing_protocol.md",
			`= <(some_id|same_connection_id_as_first_equinix_fabric_routing_protocol)>`, `= "<$1>"`),

		// one() isn't supported by the converter
		replace("fabric_connection.md",
			`one\(equinix_fabric_connection\.vd2azure_primary\.redundancy\)\.group`,
			"equinix_fabric_connection.vd2azure_primary.redundancy.0.group"),

		// A quoted string can't span lines in HCL, so use a heredoc
		replace("network_ssh_key.md", `public_key = "(ssh-rsa [^"]*)"`, "public_key = <<EOF\n  $1\n  EOF"),

		// References to a device that isn't declared in the example
		replace("network_ssh_user.md", `equinix_network_device\.csr1000v-ha\.uuid,`, `"csr1000v-ha-uuid",`),
		replace("network_ssh_user.md", `equinix_network_device\.csr1000v-ha\.redundant_uuid`,
			`"csr1000v-ha-redundant-uuid"`),
	)
}

// replace applies a regular expression replacement to the docs files matching path.
func replace(path, pattern, replacement string) tfbridge.DocsEdit {
	re := regexp.MustCompile(pattern)
	return tfbridge.DocsEdit{
		Path: path,
		Edit: func(_ string, content []byte) ([]byte, error) {
			return re.ReplaceAll(content, []byte(replacement)), nil
		},
	}
}
