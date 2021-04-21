package com.vk.api.sdk.objects.apps;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Case for declension of user name and surname: 'nom' — nominative (default),, 'gen' — genitive,, 'dat' — dative,, 'acc' — accusative,, 'ins' — instrumental,, 'abl' — prepositional. (only if 'return_friends' = '1')
 */
public enum GetNameCase implements EnumParam {
    @SerializedName("nom")
    NOMINATIVE("nom"),

    @SerializedName("gen")
    GENITIVE("gen"),

    @SerializedName("dat")
    DATIVE("dat"),

    @SerializedName("acc")
    ACCUSATIVE("acc"),

    @SerializedName("ins")
    INSTRUMENTAL("ins"),

    @SerializedName("abl")
    PREPOSITIONAL("abl");

    private final String value;

    GetNameCase(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
