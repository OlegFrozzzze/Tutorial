import Tom1.TaskOne;
import Tom1.TaskTwo;
import Tom1.TaskThee;
import java.security.MessageDigest;

import static Tom1.TaskOne.charExpression;

/**
 * Created by ОЛЕГ on 17.07.2017.
 */
public class Tutorial {
    public static void main(String[] args) throws Exception {
        System.out.println("It's alive! It's alive!");
//        Simple();
//        Tutorial();
//        flipBit();
        TaskOne.charExpression();
        TaskTwo.isPowerOfTwo();
        TaskThee.flipBit();
        }

    public static void Tutorial() throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }


    }
    public static void Simple(){
        double hex = 0x0bp3;
        System.out.println(hex);
    }
}


