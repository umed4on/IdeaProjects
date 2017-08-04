/**
 * Created by dehkon on 14.03.2017.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Roles_2_4 {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        String s = printTextPerRole(roles,textLines);
        System.out.println(s);
    }


    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder str = new StringBuilder("");
        int n = roles.length;
        int m = textLines.length;
        for (int i = 0; i < n; i++) {

            String s = roles[i] + ":";
            str.append(s + "\n");
            for (int j = 0; j < m; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    str.append((j+1) + ")" + textLines[j].replaceFirst(s, "") + "\n");
                }
            }
            if(i!=n-1){
                str.append("\n");
            }
        }
        return str.toString();
    }

}
 /**
  private static String printTextPerRole(String[] roles, String[] textLines) {

  StringBuilder[] roleTexts = new StringBuilder[roles.length];
  for (int j = 0; j < roles.length; j++) {
  roleTexts[j] = new StringBuilder();
  roleTexts[j].append(roles[j]+":\n");
  }

  int i = 1;
  for (String textLine: textLines) {
  String[] s = textLine.split(": ", 2);
  String r = s[0];
  String t = s[1];

  for (int j = 0; j < roles.length; j++) {
  if (roles[j].equals(r)) {
  roleTexts[j].append(i++ + ") "+ t +"\n");
  break;
  }
  }
  }

  StringBuilder sb = new StringBuilder();
  for (int j = 0; j < roles.length; j++) {
  sb.append(roleTexts[j].toString()+"\n");
  }

  return sb.toString();
  }
*/