package com.vk.api.sdk.objects.video.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.wall.WallComment;
import java.util.List;
import java.util.Objects;

/**
 * GetCommentsExtendedResponse object
 */
public class GetCommentsExtendedResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<WallComment> items;

    public Integer getCount() {
        return count;
    }

    public GetCommentsExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public GetCommentsExtendedResponse setItems(List<WallComment> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsExtendedResponse getCommentsExtendedResponse = (GetCommentsExtendedResponse) o;
        return Objects.equals(count, getCommentsExtendedResponse.count) &&
                Objects.equals(items, getCommentsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetCommentsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
