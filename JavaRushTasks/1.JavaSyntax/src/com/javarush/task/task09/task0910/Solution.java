package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Start");
        try{
            method1();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void method1() {
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);

        //напишите тут ваш код
    }
}