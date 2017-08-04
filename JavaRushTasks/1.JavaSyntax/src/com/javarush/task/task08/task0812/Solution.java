package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextInt());
        }
        int result = 0;
        int n = 1;
        for (int i = 1; i < 10; i++) {

            if (arrayList.get(i) == arrayList.get(i - 1)) {
                n++;
            } else {
                n = 1;
            }
            if (n > result) {
                result = n;
            }
        }
        System.out.println(result);

    }
}