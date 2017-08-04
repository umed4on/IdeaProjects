package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
        System.out.print(stackTraceElement.getClassName() +": ");
        System.out.print(stackTraceElement.getMethodName()+": ");
        System.out.println(s);
        //напишите тут ваш код
    }
}
