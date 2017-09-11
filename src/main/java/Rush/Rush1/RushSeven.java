package Rush.Rush1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RushSeven {
    public static void Rush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        while (n > 0) {
            System.out.println(a);
            n--;
        }

    }
}
