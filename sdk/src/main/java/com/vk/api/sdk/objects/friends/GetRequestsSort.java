package com.vk.api.sdk.objects.friends;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Sort order: '1' — by number of mutual friends, '0' — by date
 */
public enum GetRequestsSort implements EnumParam {
    @SerializedName("0")
    DATE(0),

    @SerializedName("1")
    MUTUAL(1),

    @SerializedName("2")
    ROTATE(2);

    private final Integer value;

    GetRequestsSort(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}