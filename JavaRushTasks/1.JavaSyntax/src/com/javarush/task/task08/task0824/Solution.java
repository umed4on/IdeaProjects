package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human kid1 = new Human("kid1",true,20);
        Human kid2 = new Human("kid2",true,15);
        Human kid3 = new Human("kid3",false,7);
        Human father = new Human("father",true,35, kid1,kid2,kid3);
        Human mother = new Human("mother",false,30, kid1,kid2,kid3);
        Human gff = new Human("gff",true,70,father);
        Human gmf = new Human("gmf",false,69,father);
        Human gfm = new Human("gfm",true,75,mother);
        Human gmm = new Human("gmm",false,67,mother);
        System.out.println(gff.toString());
        System.out.println(gfm.toString());
        System.out.println(gmf.toString());
        System.out.println(gmm.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(children);
        }

        public Human(String name, boolean sex, int age, Human kid1,Human kid2, Human kid3 ) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(kid1);
            this.children.add(kid2);
            this.children.add(kid3);
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
