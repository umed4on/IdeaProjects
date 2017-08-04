package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<String,String>();
        map.put("Umed","Nabiev");
        map.put("Umed","Nabiev");
        map.put("Umed2","Nabiev2");
        map.put("Umed3","Nabiev3");
        map.put("Umed4","Nabiev4");
        map.put("Umed5","Nabiev5");
        map.put("Umed6","Nabiev6");
        map.put("Umed7","Nabiev7");
        map.put("Umed8","Nabiev8");
        map.put("Umed9","Nabiev");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
