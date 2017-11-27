import java.io.*;
import java.nio.file.FileSystemException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.System.exit;
import static java.lang.System.out;

/**
 * Created by Mavzuna on 03.04.17.
 */
public class ABC_TestForAll {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            File file = new File("/Users/dehkon/myGit/ilm/Python/config2.yaml");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            PrintWriter out = new PrintWriter("/Users/dehkon/myGit/ilm/Python/config1.yaml");
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                if (line.charAt(line.length()-1) == ':'){
                    out.println("      max_win_turbokeno_term: *max_win_turbokeno_term");
                    out.println("      max_bet_turbokeno_term: *max_bet_turbokeno_term");
                    out.println("      bets_turbokeno_term: *bets_turbokeno_term");
                }
                out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();


    }
}
