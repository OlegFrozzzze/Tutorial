package Rush.Rush1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RushFour {
    public static void Rush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x = 0;

        if (a > 0)
            x++;
        if (b > 0)
            x++;
        if (c > 0)
            x++;
        System.out.print(x);
    }
}
