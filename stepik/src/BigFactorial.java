import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by dehkon on 06.03.2017.
 */
public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value= scanner.nextInt();
        System.out.println(factorial(value));
    }

    public static BigInteger factorial(int value)
    {
        BigInteger big = BigInteger.ONE; //присваивает к значеню big  1.
        for(int i = 1; i <= value; i++ ){
            big = big.multiply(BigInteger.valueOf(i));
        }
        return big;
    }
}
