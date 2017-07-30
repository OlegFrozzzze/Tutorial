package Rush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllRush {
    public static void Allrush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            RushOne.Rush();
        }
        RushTwo.Rush();
        RushThree.Rush();
        RushFour.Rush();
        RushFive.Rush();
    }
}
