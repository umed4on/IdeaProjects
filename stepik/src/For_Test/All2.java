package For_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Arrays.sort;

public class All2 {
    public static void main(String[] args) throws Exception {
    int[] array = new int[5];
    array[0]=1;
    array[1]=0;
    array[2]=500;
    array[3]=4;
    array[4]=2;
    sort(array);
    for(int i=0; i< 5; i++){
        System.out.println(array[i]);
    }
    }

}
