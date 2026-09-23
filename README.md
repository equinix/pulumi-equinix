[![Actions Status](https://github.com/equinix/pulumi-equinix/workflows/main/badge.svg)](https://github.com/equinix/pulumi-equinix/actions)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fequinix.svg)](https://www.npmjs.com/package/@equinix-labs/pulumi-equinix)
[![Python version](https://badge.fury.io/py/pulumi-equinix.svg)](https://pypi.org/project/pulumi-equinix)
[![NuGet version](https://badge.fury.io/nu/pulumi.equinix.svg)](https://badge.fury.io/nu/pulumi.equinix)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/equinix/pulumi-equinix/sdk/go)](https://pkg.go.dev/github.com/equinix/pulumi-equinix/sdk/go)
[![License](https://img.shields.io/github/license/equinix/pulumi-equinix)](https://github.com/equinix/pulumi-equinix/blob/main/LICENSE)

# Equinix Resource Provider

**PLEASE NOTE:** *This provider supercedes the [Pulumi Equinix Metal provider](https://www.pulumi.com/registry/packages/equinix-metal/).

The Equinix Resource Provider lets you manage [Equinix](http://deploy.equinix.com) resources (Metal, Fabric, and Network Edge).

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @equinix-labs/pulumi-equinix
```

or `yarn`:

```bash
yarn add @equinix-labs/pulumi-equinix
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_equinix
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/equinix/pulumi-equinix/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Pulumi.Equinix
```

### Java

**PLEASE NOTE:** Java is currently in preview. For more details check out [pulumi java documentation](https://www.pulumi.com/docs/intro/languages/java/#how-to-use-java-with-pulumi).

To use from Java, add the dependency below to your `pom.xml` file:

```
<dependency>
    <groupId>com.equinix.pulumi</groupId>
    <artifactId>equinix</artifactId>
    <version>[0.1.0,)</version>
</dependency>
```

## Configuration

For information about obtaining API key and secret required for Equinix Fabric and Network Edge refer to [Generating Client ID and Client Secret key](https://developer.equinix.com/dev-docs/fabric/getting-started/getting-access-token#generating-client-id-and-client-secret) from [Equinix Developer Platform portal](https://developer.equinix.com/).

Interacting with Equinix Metal requires an API auth token that can be generated at Project-level or User-level. User API keys can be obtained by creating them in the [Equinix Metal Portal](https://console.equinix.com/) or by using the [Create a User API Key](https://deploy.equinix.com/developers/api/metal/#operation/createAPIKey) endpoint. Project API keys can also be obtained by creating them in the [Equinix Metal Portal](https://console.equinix.com/) or by using the [Create a Project API Key](https://deploy.equinix.com/developers/api/metal/#operation/createProjectAPIKey) endpoint.

If you are only using Equinix Metal resources, you may omit the Client ID and Client Secret provider configuration parameters needed to access other Equinix resource types (Network Edge, Fabric, etc).

The following configuration points are available for the `equinix` provider:

- `equinix:authToken` (environment: `METAL_AUTH_TOKEN`) - (Optional) the Equinix Metal API auth key for API operations.
- `equinix:clientId` (environment: `EQUINIX_API_CLIENTID`) - (Optional) API Consumer Key available under My Apps section in Equinix developer portal.
- `equinix:clientSecret` (environment: `EQUINIX_API_CLIENTSECRET`) - (Optional) API Consumer secret available under My Apps section in Equinix developer portal.

Advanced configuration points:

- `equinix:token` (environment: `EQUINIX_API_TOKEN`) - (Optional) API token from the developer sandbox. Token's can be generated for the API Client using the OAuth2 Token features described in the [OAuth2 API](https://developer.equinix.com/catalog/accesstokenv1#operation/GetOAuth2AccessToken) documentation. The `client_id` and `client_secret` arguments will be ignored in the presence of a token argument.
- `equinix:endpoint` (environment: `EQUINIX_API_ENDPOINT`) - (Optional) the Equinix API base URL to point out desired environmen. Defaults to `https://api.equinix.com`.
- `equinix:maxRetries` - (Optional) the maximum number of retries in case of network failure.
- `equinix:maxRetryWaitSeconds` - (Optional) the maximum time to wait in case of network failure.
- `equinix:requestTimeout` - (Optional) the duration of time, in seconds, that the Equinix Platform API Client should wait before canceling an API request. Defaults to 30.
- `equinix:responseMaxPageSize` - (Optional) the maximum number of records in a single response for REST queries that produce paginated responses.
  
## Reference

For detailed reference documentation, please visit [Equinix API Docs in th Pulumi Registry](https://www.pulumi.com/registry/packages/equinix/api-docs/).
