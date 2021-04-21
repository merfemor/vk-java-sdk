package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.market.MarketItemFull;
import com.vk.api.sdk.objects.market.ServicesViewType;
import java.util.List;
import java.util.Objects;

/**
 * SearchExtendedResponse object
 */
public class SearchExtendedResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("view_type")
    private ServicesViewType viewType;

    @SerializedName("items")
    @Required
    private List<MarketItemFull> items;

    public Integer getCount() {
        return count;
    }

    public SearchExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public ServicesViewType getViewType() {
        return viewType;
    }

    public SearchExtendedResponse setViewType(ServicesViewType viewType) {
        this.viewType = viewType;
        return this;
    }

    public List<MarketItemFull> getItems() {
        return items;
    }

    public SearchExtendedResponse setItems(List<MarketItemFull> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, viewType, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchExtendedResponse searchExtendedResponse = (SearchExtendedResponse) o;
        return Objects.equals(count, searchExtendedResponse.count) &&
                Objects.equals(viewType, searchExtendedResponse.viewType) &&
                Objects.equals(items, searchExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("SearchExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", viewType=").append(viewType);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
