package Rush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RushTwo {
    public static void Rush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        boolean b = ((a % 2) == 0);

        if (a == 0) {
            System.out.println("ноль");
        } else if (a < 0 && b) {
            System.out.println("отрицательное четное число");
        } else if (a > 0 && b) {
            System.out.println("положительное четное число");
        }else if (a < 0 && !b) {
            System.out.println("отрицательное нечетное число");
        } else  if(a > 0 && !b) {
            System.out.println("положительное нечетное число");
        }
    }
}
