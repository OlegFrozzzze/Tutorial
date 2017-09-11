package Rush.Rush1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RushOne {
    public static void Rush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа");

        System.out.print("Введите число: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число: ");
        int b = Integer.parseInt(reader.readLine());

        if (a > 0 && b > 0) System.out.println(1);
        if (a < 0 && b > 0) System.out.println(2);
        if (a < 0 && b < 0) System.out.println(3);
        if (a > 0 && b < 0) System.out.println(4);
    }
}
