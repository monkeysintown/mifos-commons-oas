/**
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. If a copy of the MPL was not
 * distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifos.commons.oas.imperative.rest.sdk.core;

import lombok.experimental.UtilityClass;
import org.mifos.commons.boot.core.MifosConstants;

@UtilityClass
public class CommonOasImperativeConstants {
    public static final String MIFOS_COMMONS_OAS_PACKAGE_BASE = MifosConstants.MIFOS_PACKAGE_BASE + ".commons.oas";
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_PACKAGE_BASE = MIFOS_COMMONS_OAS_PACKAGE_BASE + ".imperative";
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_REST_SDK_PACKAGE_BASE = MIFOS_COMMONS_OAS_IMPERATIVE_PACKAGE_BASE + ".rest.sdk";
    public static final String MIFOS_COMMONS_OAS_IMPERATIVE_REST_SDK_PROPERTIES_PREFIX = MifosConstants.MIFOS_PROPERTIES_PREFIX + ".commons.oas.imperative.rest.sdk";
}
