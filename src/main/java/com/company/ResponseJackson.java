package com.company;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ResponseJackson {
    @JsonProperty("responseData")
    private ResponseData responseData;
    @JsonProperty("responseDetails")
    private String responseDetails;
    @JsonProperty("responseStatus")
    private Integer responseStatus;

    @Data
    static class ResponseData {
        @JsonProperty("feed")
        private Feed feed;
    }

    @Data
    static class Feed {
        @JsonProperty("feedUrl")
        private String feedUrl;
        @JsonProperty("title")
        private String title;
        @JsonProperty("link")
        private String link;
        @JsonProperty("author")
        private String author;
        @JsonProperty("description")
        private String description;
        @JsonProperty("type")
        private String type;
        @JsonProperty("entries")
        private List<Entry> entries;
    }

    @Data
    static class Entry {
        @JsonProperty("title")
        private String title;
        @JsonProperty("link")
        private String link;
        @JsonProperty("author")
        private String author;
        @JsonProperty("publishedDate")
        private String publishedDate;
        @JsonProperty("contentSnippet")
        private String contentSnippet;
        @JsonProperty("content")
        private String content;
        @JsonProperty("categories")
        private List<String> categories;
    }
}
