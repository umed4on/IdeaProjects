package For_Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by dehkon on 25.11.17.
 */

    public class FOR_ALL {
    public static void main(String[] args) {
        Integer i = 10;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    public static Integer transformValue(Integer i){
        return i*2;
    }
}
