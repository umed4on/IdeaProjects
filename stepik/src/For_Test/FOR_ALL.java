package For_Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.sort;

/**
 * Created by dehkon on 25.11.17.
 */

    public class FOR_ALL {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String location = reader.readLine();
        // /Users/dehkon/myGit/IdeaProjects/stepik/src/For_Test/source.txt
        //FileReader fileReader = new FileReader(new File(location));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(location)));
        String line = fileReader.readLine();
        while (line!=null){
            int n = Integer.parseInt(line);
            if(n%2 ==0) arrayList.add(n);
            line = fileReader.readLine();
        }
        fileReader.close();
        reader.close();
        sort(arrayList);

        for(int i = 0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}

