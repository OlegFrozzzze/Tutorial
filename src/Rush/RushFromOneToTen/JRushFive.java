package Rush.RushFromOneToTen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JRushFive {

    public static void JRush() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lst.add(Integer.parseInt(reader.readLine()));
        }
        
    }
}