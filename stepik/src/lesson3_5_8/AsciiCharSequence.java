package lesson3_5_8;

import java.util.Arrays;

/**
 * Created by dehkon on 19.03.2017.
 */
public class AsciiCharSequence  implements java.lang.CharSequence{

    byte[] array = {48, 101, 108, 108, 111, 33};

    public AsciiCharSequence(byte[] array) { //конструктор
        this.array = array;
    }

    @Override //возвращает длину строки
    public int length() {
        return toString().length();
    }

    @Override // возвращает символ по заданному индексу
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
      return new AsciiCharSequence(Arrays.copyOfRange(array, start, end));
    }

    @Override
    public String toString() {

        return new String(array);
    }


}
