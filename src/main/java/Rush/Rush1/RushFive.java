package Rush.Rush1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RushFive {
    public static void Rush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int z = 0;
        int x = 0;

        if (a != 0) {
            if (a > 0) z++;
            else x++;
        }

        if (b != 0) {
            if (b > 0) z++;
            else x++;
        }

        if (c != 0) {
            if (c > 0) z++;
            else x++;
        }

        System.out.println("количество положительных чисел: " + z);
        System.out.println("количество отрицательных чисел: " + x);
    }
}
