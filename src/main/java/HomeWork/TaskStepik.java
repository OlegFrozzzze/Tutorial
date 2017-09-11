package HomeWork;

import java.util.Locale;

public class TaskStepik {
    public static void Text() {
        String Str = new String("Добро пожаловать на OlegFrozzzze.ru");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toLowerCase());

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toLowerCase(Locale.ENGLISH));
    }
}
