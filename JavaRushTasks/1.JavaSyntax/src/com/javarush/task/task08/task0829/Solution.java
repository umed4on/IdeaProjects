package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String,String> hashMap = new HashMap<String,String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String people = reader.readLine();
            hashMap.put(city,people);
        }

        //read home number
        String needCity = reader.readLine();

        String answer = hashMap.get(needCity);
        System.out.println(answer);
    }
}
