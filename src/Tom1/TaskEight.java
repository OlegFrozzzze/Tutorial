package Tom1;
import java.math.BigInteger;

public class TaskEight {
    public static BigInteger factorial(){
        int value = 1;
        BigInteger fac = BigInteger.ONE;
        for (int i = 1; i <= value; ++i) fac = fac.multiply(BigInteger.valueOf(i));
        return fac;
    }
}
