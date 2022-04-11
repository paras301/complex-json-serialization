package com.company;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class ResponseGson {
    @SerializedName("responseData")
    private ResponseData responseData;
    @SerializedName("responseDetails")
    private String responseDetails;
    @SerializedName("responseStatus")
    private Integer responseStatus;

    @Data
    static class ResponseData {
        @SerializedName("feed")
        private Feed feed;
    }

    @Data
    static class Feed {
        @SerializedName("feedUrl")
        private String feedUrl;
        @SerializedName("title")
        private String title;
        @SerializedName("link")
        private String link;
        @SerializedName("author")
        private String author;
        @SerializedName("description")
        private String description;
        @SerializedName("type")
        private String type;
        @SerializedName("entries")
        private List<Entry> entries;
    }

    @Data
    static class Entry {
        @SerializedName("title")
        private String title;
        @SerializedName("link")
        private String link;
        @SerializedName("author")
        private String author;
        @SerializedName("publishedDate")
        private String publishedDate;
        @SerializedName("contentSnippet")
        private String contentSnippet;
        @SerializedName("content")
        private String content;
        @SerializedName("categories")
        private List<String> categories;
    }
}
