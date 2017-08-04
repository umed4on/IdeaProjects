package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for(int i =0 ; i<10; i++){
            hashMap.put("name" + i, i+100);
        }
        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            HashMap.Entry<String,Integer> pair = iterator.next();
            Integer result = pair.getValue();
            if(result<500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}