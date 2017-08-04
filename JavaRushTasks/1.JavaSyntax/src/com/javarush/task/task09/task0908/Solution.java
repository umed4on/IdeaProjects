package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Start");

        try {
            method1();
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public static void method1() {
        String s = null;
        String m = s.toLowerCase();
    }
}
