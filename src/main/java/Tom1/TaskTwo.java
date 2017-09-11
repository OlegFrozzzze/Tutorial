package Tom1;

public class TaskTwo {
    public static boolean isPowerOfTwo() {
        int value = 0;
        if (value == 0) {
            return false;
        } else {
            int rol = Math.abs(value);
            return (rol & (rol - 1)) == 0;
        }
    }
}
