# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('equinix')


class _ExportableConfig(types.ModuleType):
    @property
    def auth_token(self) -> Optional[str]:
        """
        The Equinix Metal API auth key for API operations
        """
        return __config__.get('authToken')

    @property
    def client_id(self) -> Optional[str]:
        """
        API Consumer Key available under My Apps section in developer portal
        """
        return __config__.get('clientId')

    @property
    def client_secret(self) -> Optional[str]:
        """
        API Consumer secret available under My Apps section in developer portal
        """
        return __config__.get('clientSecret')

    @property
    def endpoint(self) -> Optional[str]:
        """
        The Equinix API base URL to point out desired environment. Defaults to https://api.equinix.com
        """
        return __config__.get('endpoint')

    @property
    def max_retries(self) -> Optional[int]:
        """
        Maximum number of retries.
        """
        return __config__.get_int('maxRetries')

    @property
    def max_retry_wait_seconds(self) -> Optional[int]:
        """
        Maximum number of seconds to wait before retrying a request.
        """
        return __config__.get_int('maxRetryWaitSeconds')

    @property
    def request_timeout(self) -> Optional[int]:
        """
        The duration of time, in seconds, that the Equinix Platform API Client should wait before canceling an API request.
        Defaults to 30
        """
        return __config__.get_int('requestTimeout')

    @property
    def response_max_page_size(self) -> Optional[int]:
        """
        The maximum number of records in a single response for REST queries that produce paginated responses
        """
        return __config__.get_int('responseMaxPageSize')

    @property
    def token(self) -> Optional[str]:
        """
        API token from the developer sandbox
        """
        return __config__.get('token')

