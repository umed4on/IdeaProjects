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
            long l = (long) 111_1111_111_110L;
            int x = (int) 0b1000_1100_1010;
            double m = (double) 110_987_654_6299.123_34;
            float f = (float) l++ + 10 + ++x - (float) m;

            System.out.println("long l = " + l);
            System.out.println("int x = " + x);
            System.out.println("double m = " + m);
            System.out.println("float f = " + f);
            l = (long) f / 1000;
            System.out.println("result = " + l);



        }
}
