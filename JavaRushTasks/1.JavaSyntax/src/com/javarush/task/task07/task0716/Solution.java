package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        char r = 'р';
        char l = 'л';
        for(int i = 0; i < list.size(); )
        {
            String s = list.get(i);
            Boolean rr = check(s,r);
            Boolean ll = check(s,l);
            if((rr && ll) || (!rr && !ll)){
                i++;
                continue;
            }
            else if(rr){
                list.remove(i);
            }
            else if(ll){
                list.add(i+1,s);
                i=i+2;
            }

        }
        return list;
    }
    public static  Boolean check (String s , char n){
        for( int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(c == n){
                return  true;
            }
        }
        return false;
    }
}