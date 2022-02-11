package com.framework.hometask2.testrail;

import org.json.simple.JSONObject;

public class TestRailIntegration {
    public static void main(String[] args) throws Exception {
        APIClient client = new APIClient("https://mentoring.testrail.io");
        client.setUser("iryna_beznosiuk@epam.com");
        client.setPassword("vHEzNAX58drSRgJbL96G");

        JSONObject c = (JSONObject) client.sendGet("/get_case/1");
        System.out.println(c.get("title"));
    }
}