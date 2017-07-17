import java.security.MessageDigest;
/**
 * Created by ОЛЕГ on 17.07.2017.
 */
public class Tutorial {
    public static void main(String[] args) throws Exception {
        System.out.println("It's alive! It's alive!");
        Tutorial();
    }
    public static void Tutorial() throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }

    }
}
