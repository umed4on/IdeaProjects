package For_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by dehkon on 25.11.17.
 */
public class FOR_ALL {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<String> word = new ArrayList<>();
        for(int i=0; i< array.length; i++){
            if(isNumber(array[i])) number.add(Integer.parseInt(array[i]));
            else word.add(array[i]);
        }
        for(int i=0; i<number.size(); i++ ){
            for(int j=1; j<number.size(); j++){
                int next = number.get(j);
                if(number.get(j)>number.get(j-1)){
                    number.set(j,number.get(j-1));
                    number.set(j-1,next);
                }
            }
        }

        for(int i=0; i<word.size(); i++ ){
            for(int j=1; j<word.size(); j++){
                String next = word.get(j);
                if(isGreaterThan(word.get(j-1),word.get(j))){
                    word.set(j,word.get(j-1));
                    word.set(j-1,next);
                }
            }
        }

        for(int i=0; i<array.length; i++){
            String solo = array[i];
            if(isNumber(solo)){
                array[i]= String.valueOf(number.get(0));
                number.remove(0);
            }
            else{
                array[i] = word.get(0);
                word.remove(0);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }

}
