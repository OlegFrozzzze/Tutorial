package Rush.Rush1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RushNine {
    public static void Rush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int d = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
