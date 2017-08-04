package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int i =0;
        int[] a = new int[1001];
        while (scanner.hasNext()) {
            try {
                int n = scanner.nextInt();
                a[i] = n;
                i++;
            } catch (Exception e) {
                for (int j = 0; j < i; j++) {
                    System.out.println(a[j]);
                }
                break;
            }
        }


    }
}
