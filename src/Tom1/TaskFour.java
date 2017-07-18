package Tom1;

import java.security.MessageDigest;

/**
 * Created by ОЛЕГ on 18.07.2017.
 */
public class TaskFour {

    public static void Tutorial() throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}
