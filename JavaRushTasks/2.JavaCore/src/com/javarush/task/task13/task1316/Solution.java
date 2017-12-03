package com.javarush.task.task13.task1316;

/* 
Некорректные строки
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        String onPress(Object NAME);
    }

    interface Button extends SimpleObject {

        String NAME = "Submit";

        @Override
        String onPress(Object NAME);
    }
}