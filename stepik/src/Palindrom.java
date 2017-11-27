import java.util.Scanner;

//import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 * Created by dehkon on 25.02.2017.
 */
public class Palindrom {
    public static boolean isPalindrome(String text) {
        text =text.replaceAll("[^A-Za-z1-9]+", "");
        StringBuilder str = new StringBuilder(text.toLowerCase());
        str.reverse();
        return str.toString().equals(text.toLowerCase());
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));
    }

    /* решение одной строкой
    public static boolean isPalindrome(String text) {
        return text.replaceAll("[^a-zA-Z0-9]","").equalsIgnoreCase(new StringBuilder(text.replaceAll("[^a-zA-Z0-9]","")).reverse().toString());
    }*/

}
