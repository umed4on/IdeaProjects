package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Start");
        try{
            method1();
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
    public static void method1(){

        int num = Integer.parseInt("XYZ");
        System.out.println(num);

        //напишите тут ваш код
    }
}
