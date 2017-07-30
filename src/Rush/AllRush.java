package Rush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllRush {
    public static void Allrush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            RushOne.Rush();
        } else {
            if (a == 2) {
                RushTwo.Rush();
            } else {
                if (a == 3) {
                    RushThree.Rush();
                } else {
                    if (a == 4) {
                        RushFour.Rush();
                    } else {
                        if (a == 5) {
                            RushFive.Rush();
                        }
                    }
                }
            }
        }
    }
}
