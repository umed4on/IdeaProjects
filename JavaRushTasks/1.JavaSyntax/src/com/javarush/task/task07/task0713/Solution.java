package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
            if (arrayList.get(i) % 3 == 0) {
                list3.add(arrayList.get(i));
            }
            if (arrayList.get(i) % 2 == 0) {
                list2.add(arrayList.get(i));
            }
            if ((arrayList.get(i) % 2 != 0) && (arrayList.get(i) % 3 != 0)) {
                otherList.add(arrayList.get(i));
            }
        }

        printList(list3);
        printList(list2);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
