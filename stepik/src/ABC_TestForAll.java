import java.io.*;
import java.nio.file.FileSystemException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.System.exit;

/**
 * Created by Mavzuna on 03.04.17.
 */
public class ABC_TestForAll {
    public static void main(String[] args) {

        // вводим значение 1 района
        String name1 ="Исмоили Сомони";
        int amountN1 = 142500 ;
        double precentN1 = 17.7;
        int amountR1 = 525;
        double precentR1 = 25;
        int amountV1 = 6000;
        double precentV1 = 27.2;

        // вводим значение 2 района
        String name2 ="Сино";
        int amountN2 = 307300;
        double precentN2 = 38.2;
        int amountR2 = 525;
        double precentR2 = 25;
        int amountV2 = 5500;
        double precentV2 = 25;

        // вводим значение 3 района
        String name3 ="Фирдавси";
        int amountN3 = 198300;
        double precentN3 = 24.6;
        int amountR3 = 525;
        double precentR3 = 25;
        int amountV3 = 5200;
        double precentV3 = 23.6;

        // вводим значение 4 района
        String name4 ="Шохмансур";
        int amountN4 = 155100;
        double precentN4 = 19.3;
        int amountR4 = 525;
        double precentR4 = 25;
        int amountV4 = 5300;
        double precentV4 = 24.9;

        // вычислим ИПС каждого района по формуле ИПС = 0.5 * Ni + 0.3 * Ri + 0.2*Vi;
        double IPC1 = 0.5 * precentN1 + 0.3 * precentR1 + 0.2 * precentV1;
        double IPC2 = 0.5 * precentN2 + 0.3 * precentR2 + 0.2 * precentV2;
        double IPC3 = 0.5 * precentN3 + 0.3 * precentR3 + 0.2 * precentV3;
        double IPC4 = 0.5 * precentN4 + 0.3 * precentR4 + 0.2 * precentV4;

        //вычислим V каждого района по формуле V = (Vi * IPC)/100;
        double V1 = (100000 * IPC1) / 100;
        double V2 = (100000 * IPC2) / 100;
        double V3 = (100000 * IPC3) / 100;
        double V4 = (100000 * IPC4) / 100;

        // Для каждого района выведем полученные значения IPC и V
        System.out.println("в районе " + name1 + " ИПС = " + IPC1 + " , V = " + V1);
        System.out.println("в районе " + name2 + " ИПС = " + IPC2 + " , V = " + V2);
        System.out.println("в районе " + name3 + " ИПС = " + IPC3 + " , V = " + V3);
        System.out.println("в районе " + name4 + " ИПС = " + IPC4 + " , V = " + V4);

    }
}
