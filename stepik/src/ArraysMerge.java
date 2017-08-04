import java.util.Arrays;

/**
 * Created by dehkon on 06.03.2017.
 */
public class ArraysMerge {
    public static void main(String[] args) {
        int[] array1 = {1,23,23,56,2,3,5345};
        int[] array2 = {120,0,0,0,1,2,3,4,5,6,7};
        int[] res = new int[array1.length + array2.length];
        res = mergeArrays(array1,array2);
        for(int i=0; i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
    public static int[] mergeArrays(int[] a1, int[] a2){
        int[] res = new int[a1.length + a2.length];
        System.arraycopy(a1,0,res,0,a1.length);
        System.arraycopy(a2,0,res,a1.length,a2.length);
        Arrays.sort(res);
        return res;
    }

    /* красивое решение без сортировки
public static int[] mergeArrays(int[] a1, int[] a2) {
    int i = 0, j = 0;
    int[] res = new int[a1.length + a2.length];

    while (i < a1.length && j < a2.length)
        res[i + j] = (a1[i] < a2[j]) ? a1[i++] : a2[j++];
    while (i < a1.length)
        res[i + j] = a1[i++];
    while (j < a2.length)
        res[i + j] = a2[j++];
    return res;
}
     */
}
