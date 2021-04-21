package com.vk.api.sdk.objects.market;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum SearchSort implements EnumParam {
    @SerializedName("0")
    DEFAULT(0),

    @SerializedName("1")
    DATE(1),

    @SerializedName("2")
    PRICE(2),

    @SerializedName("3")
    RELEVANCE(3);

    private final Integer value;

    SearchSort(Integer value) {
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
