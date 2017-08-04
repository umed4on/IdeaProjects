import java.util.Arrays;

/**
 * Created by dehkon on 06.03.2017.
 */
public class ArraySort {
    public static void main(String[] args) {
        int [] array = {8,9,7,6,4,3,56,2,0,1};
        Arrays.sort(array);
        for(int i : array){
            System.out.println(array[i]);
        }
    }
}
