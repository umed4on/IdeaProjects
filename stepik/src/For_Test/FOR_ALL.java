package For_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by dehkon on 25.11.17.
 */
public class FOR_ALL {

    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        //напишите тут ваш код
        for(int i =0; i<40; i++)
        {
            for(int j =i; j<s.length(); j++){
                System.out.print(s.charAt(j));

            }
            System.out.println();
        }

    }
}
