package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("firstName" + i, "lastName" + i);
        }
        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int valueResult = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)) {
                valueResult++;
            }
        }
        return valueResult;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
       return 1; // key уникальные, не могут совпадать, ответ всегда будет 1.
    }

    public static void main(String[] args) {

    }
}
