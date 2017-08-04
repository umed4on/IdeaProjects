package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        char[] vowel = new char[1001];
        int v = 0;
        char[] pet = new char[1001];
        int cc = 0;
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            if (isVowel(line.charAt(i))) {
                vowel[v] = line.charAt(i);
                v++;
            } else {
                if (line.charAt(i) != ' ') {
                    pet[cc] = line.charAt(i);
                    cc++;
                }
            }

        }
        for (int i = 0; i < v; i++) {
            System.out.print(vowel[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < cc; i++) {
            System.out.print(pet[i] + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}