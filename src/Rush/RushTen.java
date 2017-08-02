package Rush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RushTen {
    public static void Rush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (int i = 0; i < 10; i ++){
            System.out.println(s+" любит меня.");
        }
    }
}
