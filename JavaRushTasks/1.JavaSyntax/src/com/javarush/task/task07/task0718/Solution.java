package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
        int k=0;
        for(int i = 1; i<10; i++) {
            if(arrayList.get(i).length() < arrayList.get(i-1).length()){
                k=i;
                break;
            }
        }
        if(k!=0){
            System.out.println(k);
        }
    }
}

