package HomeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskJavaRushTwo {
    public static void Rush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String chislo = reader.readLine();


        int age1 = Integer.parseInt(chislo);

        if (age1 < 18) {
            System.out.println("Подрасти еще");
        } else {
            System.out.println("Проходите");
        }
    }
}

