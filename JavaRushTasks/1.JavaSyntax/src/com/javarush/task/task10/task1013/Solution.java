package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstname;
        private String lastname;
        private String city;
        private int age;
        private double weight;
        private double cash;

        public Human (String firstname, String lastname, String city, int age, double weight, double cash){
            this.firstname=firstname;
            this.lastname=lastname;
            this.city=city;
            this.age=age;
            this.weight=weight;
            this.cash=cash;
        }

        public Human (String firstname, String lastname, String city, int age, double weight){
            this.firstname=firstname;
            this.lastname=lastname;
            this.city=city;
            this.age=age;
            this.weight=weight;
        }

        public Human (String firstname, String lastname, String city, int age){
            this.firstname=firstname;
            this.lastname=lastname;
            this.city=city;
            this.age=age;
        }

        public Human (String firstname, String lastname, String city){
            this.firstname=firstname;
            this.lastname=lastname;
            this.city=city;
        }

        public Human (String firstname, String lastname){
            this.firstname=firstname;
            this.lastname=lastname;
        }

        public Human (String firstname){
            this.firstname=firstname;
        }

        public Human (String firstname, double cash){
            this.firstname=firstname;
            this.cash=cash;
        }

        public Human(double cash, String city){
            this.city=city;
            this.cash=cash;

        }

        public Human(double cash){

            this.cash=cash;
        }

        public Human(double cash, double weight){

            this.cash=cash;
            this.weight=weight;
        }

    }
}
