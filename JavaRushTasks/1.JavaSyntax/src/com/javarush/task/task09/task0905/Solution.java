package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int i=0;
        for(StackTraceElement element : stackTraceElements){
            i++;
        }
        //оказывается длину можно получиться на много проще  stackTraceElements.length;
        System.out.println(i);
        return i;
    }
}

