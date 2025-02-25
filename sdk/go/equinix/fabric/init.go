// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package fabric

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "equinix:fabric/cloudRouter:CloudRouter":
		r = &CloudRouter{}
	case "equinix:fabric/connection:Connection":
		r = &Connection{}
	case "equinix:fabric/connectionRouteFilter:ConnectionRouteFilter":
		r = &ConnectionRouteFilter{}
	case "equinix:fabric/network:Network":
		r = &Network{}
	case "equinix:fabric/routeFilter:RouteFilter":
		r = &RouteFilter{}
	case "equinix:fabric/routeFilterRule:RouteFilterRule":
		r = &RouteFilterRule{}
	case "equinix:fabric/routingProtocol:RoutingProtocol":
		r = &RoutingProtocol{}
	case "equinix:fabric/serviceProfile:ServiceProfile":
		r = &ServiceProfile{}
	case "equinix:fabric/serviceToken:ServiceToken":
		r = &ServiceToken{}
	case "equinix:fabric/stream:Stream":
		r = &Stream{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/cloudRouter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/connection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/connectionRouteFilter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/network",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/routeFilter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/routeFilterRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/routingProtocol",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/serviceProfile",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/serviceToken",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"equinix",
		"fabric/stream",
		&module{version},
	)
}
