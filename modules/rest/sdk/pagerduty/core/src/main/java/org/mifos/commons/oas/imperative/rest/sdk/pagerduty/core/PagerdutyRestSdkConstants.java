/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifos.commons.oas.imperative.rest.sdk.pagerduty.core;

import lombok.experimental.UtilityClass;

import static org.mifos.commons.oas.imperative.rest.sdk.core.CommonOasImperativeConstants.MIFOS_COMMONS_OAS_IMPERATIVE_REST_SDK_PACKAGE_BASE;
import static org.mifos.commons.oas.imperative.rest.sdk.core.CommonOasImperativeConstants.MIFOS_COMMONS_OAS_IMPERATIVE_REST_SDK_PROPERTIES_PREFIX;

@UtilityClass
public class PagerdutyRestSdkConstants {
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_PACKAGE_BASE = MIFOS_COMMONS_OAS_IMPERATIVE_REST_SDK_PACKAGE_BASE + ".pagerduty";
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_CORE_PACKAGE = MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_PACKAGE_BASE + ".core";
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_IMPLEMENTATION_PACKAGE = MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_PACKAGE_BASE + ".implementation";
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_PROPERTIES_PREFIX = MIFOS_COMMONS_OAS_IMPERATIVE_REST_SDK_PROPERTIES_PREFIX + ".pagerduty";
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_PROPERTIES_ENABLED =
            MIFOS_COMMONS_OAS_IMPERATIVE_SDK_PAGERDUTY_PROPERTIES_PREFIX + ".enabled";
}
