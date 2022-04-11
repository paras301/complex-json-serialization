package com.company;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//JSON to JAVA object de-serialization using GSON
public class SerializationTestGson {
    public static void main(String args[]) throws IOException {
        Gson gson = new Gson();
        Reader r = new FileReader("src/main/resources/sample.json");
        ResponseGson responseGson = gson.fromJson(r, ResponseGson.class);

        System.out.println("JAVA Object == " + responseGson);

        //Serialization
        String json = gson.toJson(responseGson);
        System.out.println("JSON == " + json);
    }
}
