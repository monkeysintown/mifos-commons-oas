/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifos.commons.oas.imperative.rest.sdk.stripe.starter;

import lombok.extern.slf4j.Slf4j;
import org.mifos.commons.oas.imperative.rest.sdk.stripe.core.StripeRestSdkProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import static org.mifos.commons.oas.imperative.rest.sdk.stripe.core.StripeRestSdkConstants.MIFOS_COMMONS_OAS_IMPERATIVE_SDK_STRIPE_CORE_PACKAGE;
import static org.mifos.commons.oas.imperative.rest.sdk.stripe.core.StripeRestSdkConstants.MIFOS_COMMONS_OAS_IMPERATIVE_SDK_STRIPE_IMPLEMENTATION_PACKAGE;

@Slf4j
@EnableConfigurationProperties({StripeRestSdkProperties.class})
@ComponentScan(MIFOS_COMMONS_OAS_IMPERATIVE_SDK_STRIPE_CORE_PACKAGE)
@ComponentScan(MIFOS_COMMONS_OAS_IMPERATIVE_SDK_STRIPE_IMPLEMENTATION_PACKAGE)
class StripeRestSdkAutoConfiguration {
    // TODO: configure client beans with authentication
}
