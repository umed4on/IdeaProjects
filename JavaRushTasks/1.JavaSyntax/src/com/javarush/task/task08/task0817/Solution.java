package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String,String> pair : copy.entrySet()){
            int count = 0;
            for (Map.Entry pair2 : copy.entrySet()){
                if (pair2.getValue().equals(pair.getValue())){
                    count++;
                    if (count > 1)
                        removeItemFromMapByValue(map, pair.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
