package Rush;

import Rush.Rush1.*;
import Rush.RushFromOneToTen.JRushOne;

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
                        } else {
                            if (a == 6) {
                                RushSix.Rush();
                            }
                        }
                    }
                }
            }
        }
        int b = Integer.parseInt(reader.readLine());

        if (b <= 0) {
            System.out.println("Стоп");
        } else {
            if (b == 1) {
                JRushOne.Jrush();
            }
        }
    }
}
