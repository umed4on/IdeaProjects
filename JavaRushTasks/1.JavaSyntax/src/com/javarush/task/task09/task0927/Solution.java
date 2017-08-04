package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> hashMap = new HashMap<String,Cat>();
        hashMap.put("cat1", new Cat("app1"));
        hashMap.put("cat2", new Cat("app2"));
        hashMap.put("cat3", new Cat("app3"));
        hashMap.put("cat4", new Cat("app4"));
        hashMap.put("cat5", new Cat("app5"));
        hashMap.put("cat6", new Cat("app6"));
        hashMap.put("cat7", new Cat("app7"));
        hashMap.put("cat8", new Cat("app8"));
        hashMap.put("cat9", new Cat("app9"));
        hashMap.put("cat0", new Cat("app0"));
        return hashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        HashSet<Cat> hashSet = new HashSet<Cat>(map.values());
        return hashSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
