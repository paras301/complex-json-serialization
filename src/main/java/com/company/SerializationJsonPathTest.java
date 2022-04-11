package com.company;


import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SerializationJsonPathTest {
    public static void main(String args[])  throws IOException {
        File f = new File("src/main/resources/sample.json");
        InputStream is = new FileInputStream(f);
        String json = new String(is.readAllBytes());

        String feedUrl = JsonPath.read(json, "$.responseData.feed.feedUrl");
        System.out.println("feedUrl -- " + feedUrl);

        String entry1Title = JsonPath.read(json, "$.responseData.feed.entries[0].title");
        System.out.println("entry1Title -- " + entry1Title);

        List<String> entries = JsonPath.read(json, "$.responseData.feed.entries");
        System.out.println("entries -- " + entries);
    }
}
