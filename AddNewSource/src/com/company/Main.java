package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/dehkon/myGit/IdeaProjects/AddNewSource/config.yaml");
            File filew = new File("/Users/dehkon/work/mobcas3_flash_cfg/config.yaml");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            FileWriter writer = new FileWriter(filew);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                if(customer(line)){
                    writer.write("      max_win_99911: *max_win_99911" + "\n");
                    writer.write("      max_bet_99911: *max_bet_99911" + "\n");
                    writer.write("      bets_99911: *bets_99911" + "\n");
                    writer.write(line+ "\n");
                }
                else{
                    if(line.length()>0)
                        writer.write(line + "\n");
                }
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean customer(String line) {
        char c =' ';
        char d =':';
        int k = 0;
        for(int i=0; i<line.length(); i++)
        {
            if(c == line.charAt(i)) k++;
        }
        if(k == 4 && line.charAt(line.length()-1) == d) return true;
        else return false;
    }
}
