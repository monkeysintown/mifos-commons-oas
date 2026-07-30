/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifos.commons.oas.imperative.sdk.fineract.starter;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mifos.commons.oas.imperative.rest.sdk.fineract.core.FineractRestSdkProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import static org.mifos.commons.oas.imperative.rest.sdk.fineract.core.FineractRestSdkConstants.MIFOS_COMMONS_OAS_IMPERATIVE_SDK_FINERACT_CORE_PACKAGE;
import static org.mifos.commons.oas.imperative.rest.sdk.fineract.core.FineractRestSdkConstants.MIFOS_COMMONS_OAS_IMPERATIVE_SDK_FINERACT_IMPLEMENTATION_PACKAGE;

@Slf4j
@RequiredArgsConstructor
@EnableConfigurationProperties({FineractRestSdkProperties.class})
@ComponentScan(MIFOS_COMMONS_OAS_IMPERATIVE_SDK_FINERACT_CORE_PACKAGE)
@ComponentScan(MIFOS_COMMONS_OAS_IMPERATIVE_SDK_FINERACT_IMPLEMENTATION_PACKAGE)
@Import(FineractRestSdkProperties.class)
final class FineractRestSdkAutoConfiguration {}
