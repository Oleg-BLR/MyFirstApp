package com.beginsecure;

import netscape.javascript.JSObject;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {
//        System.out.println("hello world");
        String myString = "{\"name\" : \"Mary\"}";
        JSONObject job = new JSONObject(myString);

        System.out.println("the name is " + job.get("name"));

    }
}
