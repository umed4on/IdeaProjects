package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Program starts");

        try
        {
            method1();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

    }
    public static void method1(){

        int a = 42 / 0;

    }
}
