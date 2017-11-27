package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human father1 =new Human("Николай", true, 70);
        Human father2 =new Human("Петр", true, 75);
        Human mother1 =new Human("Варвара", false, 65);
        Human mother2 =new Human("Клава", false, 60);
        Human man =new Human("Папаша", true, 40, father1, mother1);
        Human woman =new Human("Мамаша", false, 30, father2, mother2);
        Human son1 =new Human("Сын", true, 10, man, woman);
        Human son2 =new Human("Сынок", true, 1, man, woman);
        Human daughter =new Human("Доча", false, 15, man, woman);
        System.out.println(father1);
        System.out.println(father2);
        System.out.println(mother1);
        System.out.println(mother2);
        System.out.println(man);
        System.out.println(woman);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















