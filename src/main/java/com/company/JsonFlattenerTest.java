package com.company;


import com.github.wnameless.json.flattener.JsonFlattener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

//Ref: https://github.com/wnameless/json-flattener
//Flattens JSON to MAP
public class JsonFlattenerTest {
    public static void main (String args[]) throws IOException {
        File f = new File("src/main/resources/sample.json");
        InputStream is = new FileInputStream(f);
        String json = new String(is.readAllBytes());

        Map<String, Object> flattenJson = JsonFlattener.flattenAsMap(json);

        System.out.println(flattenJson);
        // {a.b=1, a.c=null, a.d[0]=false, a.d[1]=true, e=f, g=2.3}
    }
}
