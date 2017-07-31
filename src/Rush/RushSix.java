package Rush;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RushSix {
    public static void Rush() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("getX: ");
        int getX = Integer.parseInt(reader.readLine());
        System.out.print("getY: ");
        int getY = Integer.parseInt(reader.readLine());
        System.out.print("toX: ");
        int toX = Integer.parseInt(reader.readLine());
        System.out.print("toY: ");
        int toY = Integer.parseInt(reader.readLine());
    }
}
