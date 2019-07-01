package com.vk.api.sdk.objects.account.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.users.UserMin;
import java.util.List;
import java.util.Objects;

/**
 * GetBannedResponse object
 */
public class GetBannedResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    @Required
    private Integer count;

    @SerializedName("items")
    @Required
    private List<Integer> items;

    @SerializedName("profiles")
    private List<UserMin> profiles;

    @SerializedName("groups")
    private List<Group> groups;

    public Integer getCount() {
        return count;
    }

    public GetBannedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Integer> getItems() {
        return items;
    }

    public GetBannedResponse setItems(List<Integer> items) {
        this.items = items;
        return this;
    }

    public List<UserMin> getProfiles() {
        return profiles;
    }

    public GetBannedResponse setProfiles(List<UserMin> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public GetBannedResponse setGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBannedResponse getBannedResponse = (GetBannedResponse) o;
        return Objects.equals(count, getBannedResponse.count) &&
                Objects.equals(profiles, getBannedResponse.profiles) &&
                Objects.equals(groups, getBannedResponse.groups) &&
                Objects.equals(items, getBannedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetBannedResponse{");
        sb.append("count=").append(count);
        sb.append(", profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
