package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int a =0;a <10;a++) list.add(reader.readLine());
        ArrayList result = doubleValues(list);


        for (int i = 0 ; i < result.size();i++)
            System.out.println(result.get(i));
    }

    public static ArrayList doubleValues(ArrayList list) {
        for (int i=0;i < list.size();i++) {
            list.add(i+1,list.get(i));
            i++;
        }
        return list;

    }
}
