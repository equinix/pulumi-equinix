{
  description = "A flake️️";
  inputs = { nixpkgs.url = "github:nixos/nixpkgs?ref=nixpkgs-unstable"; };
  outputs = { nixpkgs, ... }:
    let
      system = "aarch64-darwin";
      pkgs = nixpkgs.legacyPackages.${system};
    in with pkgs; {
      packages.${system} = rec {
        hello = hello;
        default = hello;
      };
      devShells.${system} = rec {
        default = mkShell { 
	shellHook = ''
	export USER=tng1
	export HOME=/Users/tng1
	export SSL_CERT_FILE=/Users/tng1/nix-ca-bundle.pem
	dotnet nuget update source nuget.org --source https://nexus.equinix.com/repository/nuget.org-proxy/index.json
	'';
      packages = [
	      git
	      curl
	      gnutar
	      gnugrep
	      gnused
	      gawk
	      findutils

	      go
	      gotools
	      golangci-lint
	      openssh

	      nodejs_24
	      yarn

	      dotnet-sdk_8
	      cacert

	      jdk17
	      gradle

	      pulumi

            (pkgs.python312.withPackages (ps: with ps; [
              pip
              setuptools
              wheel
            ]))
          ];
	};
      };
    };
}
