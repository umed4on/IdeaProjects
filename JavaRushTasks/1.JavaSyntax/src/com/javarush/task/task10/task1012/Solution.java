package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        // проблема в букве Е
        int[] beta = new int[33];
        for(int i=0; i<33; i++){beta[i]=0;}
        for(int i =0; i<list.size(); i++){
            String s = list.get(i);
            for(int j=0; j<s.length(); j++){
                char a = s.charAt(j);
                int b = (int)a - 1072;
                beta[b]++;
                //System.out.println("char a= " + a + " int b= " + b + " beta[b]= " + beta[b]);
            }
        }
        for(int i=0; i<33; i++){
            System.out.println(alphabet.get(i) + " " + beta[i]);
        }
    }

}
