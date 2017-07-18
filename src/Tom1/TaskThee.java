package Tom1;

/**
 * Created by ОЛЕГ on 18.07.2017.
 */
public class TaskThee {
    public static int flipBit() {
        int value = 2;
        int bitIndex = 6;
        System.out.println(value^(1 << bitIndex-1)); // put your implementation here
        return value^(1 << bitIndex-1);
    }
}
