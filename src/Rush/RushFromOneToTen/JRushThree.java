package Rush.RushFromOneToTen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JRushThree {
    public static void JRush() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < a; i++) {
            System.out.print("--");
        }
        System.out.println("");
        for (int i = 0; i < b; i++)
            System.out.println("|");
    }

}
