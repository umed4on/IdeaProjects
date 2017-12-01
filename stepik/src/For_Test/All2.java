package For_Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class All2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s= reader.readLine();
        while (!s.isEmpty()){
            System.out.println("app");
            s = reader.readLine();
        }
        System.out.println("end");

    }

}
