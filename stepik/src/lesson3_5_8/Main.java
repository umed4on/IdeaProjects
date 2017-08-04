package lesson3_5_8;

/**
 * Created by dehkon on 19.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        byte[] bytes ={72,101, 108, 108, 111, 33};
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(bytes);
        System.out.println(asciiCharSequence.toString());
        int p = asciiCharSequence.charAt(2);
        System.out.println(p);
        System.out.println(asciiCharSequence.subSequence(2,4) );
        System.out.println(asciiCharSequence.length());

    }
}
