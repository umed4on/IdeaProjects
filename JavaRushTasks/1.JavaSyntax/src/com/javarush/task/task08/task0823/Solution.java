package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result = "";
        char space = ' ';
        String up = "" + s.charAt(0);
        result = result +  up.toUpperCase();
        for(int i=1; i< s.length(); i++) {
            String upp = "" + s.charAt(i);
            if(space == (s.charAt(i-1))){
                result = result +  upp.toUpperCase();
            }
            else{
                result = result +  upp;
            }
        }
        System.out.println(result);
    }
}
