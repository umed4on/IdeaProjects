package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Petrov", new Date("MAY 11 1356"));
        map.put("Sidorov", new Date("APRIL 20 1994"));
        map.put("Kirilov", new Date("MARCH 17 2001"));
        map.put("Partirov", new Date("JUNE 21 2006"));
        map.put("Galkin", new Date("AUGUST 13 1983"));
        map.put("VanDam", new Date("JULY 18 1985"));
        map.put("Nabiev", new Date("AUGUST 17 1993"));
        map.put("Murodov", new Date("APRIL 5 1996"));
        map.put("Kaputov", new Date("APRIL 8 1990"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String,Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            HashMap.Entry<String,Date> pair = iterator.next();
            Date date = pair.getValue();
            int month = date.getMonth();
            if(month >=5 && month<=7 ){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
