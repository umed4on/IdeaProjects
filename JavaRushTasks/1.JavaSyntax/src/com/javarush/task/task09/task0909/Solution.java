package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Start");
        try{
            method1();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void method1() {
        int[] m = new int[2];
        m[8] = 5;

        //напишите тут ваш код
    }
}
