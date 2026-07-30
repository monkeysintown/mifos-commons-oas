/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifos.commons.oas.imperative.rest.sdk.jira.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static org.mifos.commons.oas.imperative.rest.sdk.jira.core.JiraRestSdkConstants.MIFOS_COMMONS_OAS_IMPERATIVE_SDK_JIRA_PROPERTIES_PREFIX;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = MIFOS_COMMONS_OAS_IMPERATIVE_SDK_JIRA_PROPERTIES_PREFIX)
public class JiraRestSdkProperties {
    @Builder.Default
    private Boolean enabled = true;
    private String url;
    private String username;
    private String password;
    private String token;
}
