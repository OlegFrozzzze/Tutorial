package Rush.RushFromOneToTen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JRushOne {
    public static void Jrush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 10; i++) {
            System.out.print(a);
        }
        System.out.println();
        {
            for (int i = 1; i <= 10; i++)
                System.out.println(b);
        }
    }
}
