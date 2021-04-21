package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Musician object
 */
public class Musician implements Validable {
    /**
     * Targeting music artist ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Music artist name
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Music artist photo
     */
    @SerializedName("avatar")
    private String avatar;

    public Integer getId() {
        return id;
    }

    public Musician setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Musician setName(String name) {
        this.name = name;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public Musician setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, avatar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician musician = (Musician) o;
        return Objects.equals(name, musician.name) &&
                Objects.equals(id, musician.id) &&
                Objects.equals(avatar, musician.avatar);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Musician{");
        sb.append("name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", avatar='").append(avatar).append("'");
        sb.append('}');
        return sb.toString();
    }
}
