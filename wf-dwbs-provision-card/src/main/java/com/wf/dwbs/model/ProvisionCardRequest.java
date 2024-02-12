package com.wf.dwbs.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class ProvisionCardRequest {
    public enum WalletNameEnum {
        APPLE_PAY("APPLE_PAY"),
        GOOGLE_PAY("GOOGLE_PAY"),
        SAMSUNG_PAY("SAMSUNG_PAY"),
        PAYPAL("PAYPAL"),
        PAZE("PAZE");
        private String value;

        walletNameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static WalletNameEnum fromValue(String value) {
            for(WalletNameEnum b : WalletNameEnum.values()) {
                if(b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    @JsonProperty("walletName")
    private WalletNameEnum walletName;

    @JsonProperty("interdictionDetails")
    private InterdictionDetails interdictionDetails;
}
