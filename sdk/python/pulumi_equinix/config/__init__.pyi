# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

authToken: Optional[str]
"""
The Equinix Metal API auth key for API operations
"""

clientId: Optional[str]
"""
API Consumer Key available under "My Apps" in developer portal. This argument can also be specified with the
`EQUINIX_API_CLIENTID` shell environment variable.
"""

clientSecret: Optional[str]
"""
API Consumer secret available under "My Apps" in developer portal. This argument can also be specified with the
`EQUINIX_API_CLIENTSECRET` shell environment variable.
"""

endpoint: Optional[str]
"""
The Equinix API base URL to point out desired environment. This argument can also be specified with the
`EQUINIX_API_ENDPOINT` shell environment variable. (Defaults to `https://api.equinix.com`)
"""

maxRetries: Optional[int]
"""
Maximum number of retries in case of network failure.
"""

maxRetryWaitSeconds: Optional[int]
"""
Maximum number of seconds to wait before retrying a request.
"""

requestTimeout: Optional[int]
"""
The duration of time, in seconds, that the Equinix Platform API Client should wait before canceling an API request.
Canceled requests may still result in provisioned resources. (Defaults to `30`)
"""

responseMaxPageSize: Optional[int]
"""
The maximum number of records in a single response for REST queries that produce paginated responses. (Default is client
specific)
"""

token: Optional[str]
"""
API tokens are generated from API Consumer clients using the [OAuth2
API](https://developer.equinix.com/dev-docs/fabric/getting-started/getting-access-token#request-access-and-refresh-tokens).
This argument can also be specified with the `EQUINIX_API_TOKEN` shell environment variable.
"""

