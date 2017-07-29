package Rush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RushThree {
    public static void Rush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a >= 1 && a <= 9) {
            if (a % 2 == 0) {
                System.out.println("четное однозначное число");
            } else {
                System.out.println("нечетное однозначное число");
            }
        } else if (a >= 10 && a <= 99) {
            if (a % 2 == 0) {
                System.out.println("четное двузначное число");
            } else {
                System.out.println("нечетное двузначное число");
            }
        } else if (a >= 100 && a <= 999) {
            if (a % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}
