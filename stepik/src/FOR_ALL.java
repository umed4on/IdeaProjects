import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by dehkon on 25.11.17.
 */
public class FOR_ALL {

    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList();
        int[] array1 = new int[5];
        int[] array2 = new int[2];
        int[] array3 = new int[4];
        int[] array4 = new int[7];
        int[] array5 = new int[0];
        arrayList.add(array1);
        arrayList.add(array2);
        arrayList.add(array3);
        arrayList.add(array4);
        arrayList.add(array5);
        return arrayList;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }

}
