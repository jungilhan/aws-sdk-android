/*
 * Copyright 2018-2018 Amazon.com, Inc. or its affiliates.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobile.client.results;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.CognitoMfaSettings;

public enum MFAOptions {
    SMS_MFA(CognitoMfaSettings.SMS_MFA),
    TOTP_MFA(CognitoMfaSettings.TOTP_MFA);

    private final String serviceText;

    MFAOptions(final String serviceText) {
        this.serviceText = serviceText;
    }

    public boolean equals(final String serviceText) {
        return this.serviceText.equals(serviceText);
    }

    public String getServiceText() {
        return this.serviceText;
    }
}
