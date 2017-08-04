package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList();
        int min = 0, max = 0;
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
            max = arrayList.get(i).length() > arrayList.get(max).length() ? i:max;
            min = arrayList.get(i).length() < arrayList.get(min).length() ? i:min;
        }
        System.out.println(min < max ? arrayList.get(min) : arrayList.get(max));
    }
}