package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//JSON to JAVA object de-serialization using Jackson
public class SerializationTestJackson {
    public static void main(String args[]) throws IOException {
        ObjectMapper om = new ObjectMapper();
        ResponseJackson rd = om.readValue(new File("src/main/resources/sample.json"), ResponseJackson.class);

        System.out.println("JAVA Object == " + rd);

        //Serialization
        System.out.println("JSON == " + om.writeValueAsString(rd));
    }
}
