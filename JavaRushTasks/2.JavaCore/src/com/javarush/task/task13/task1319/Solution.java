package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String location = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(location));
        // /Users/dehkon/myGit/IdeaProjects/stepik/src/For_Test/source.txt
        // InputStream inStream = new FileInputStream(location);
        // OutputStream outputStream = new FileOutputStream(location);
        String line = reader.readLine();
        while (!line.equals("exit")){
            writer.write(line + "\n");
            line = reader.readLine();

        }
        writer.write(line + "\n");
        writer.close();
        reader.close();

    }
}
