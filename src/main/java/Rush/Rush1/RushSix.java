package Rush.Rush1;

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

        int X = toX - getX;
        int Y = toY - getY;

        if (X > 0) {
            System.out.println("Поверни вправо");
            for (int i = 0; i < X; i++) {
                System.out.println("Сделай шаг");
            }
            System.out.println("Поверни влево");
        }else {
            System.out.println("Поверни влево");
            for (int i = 0; i < Math.abs(X); i++) {
                System.out.println("Сделай шаг");
            }
            System.out.println("Поверни вправо");
        }
        if (Y > 0) {
            for (int i = 0; i < Y; i++) {
                System.out.println("Сделай шаг");
            }
        } else {
            System.out.println("Поверни влево");
            System.out.println("Поверни влево");
            for (int i = 0; i < Math.abs(Y); i++) {
                System.out.println("Сделай шаг");
            }
            System.out.println("Поверни вправо");
            System.out.println("Поверни вправо");
        }
    }
}

