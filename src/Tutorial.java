import java.security.MessageDigest;
/**
 * Created by ОЛЕГ on 17.07.2017.
 */
public class Tutorial {
    public static void main(String[] args){
        System.out.println("It's alive! It's alive!");
        charExpression();
        }public static char charExpression() {
        int a = 1;
        System.out.println((char)('\\'+a));
        return (char)('\\'+a);
       // Simple();
       // Tutorial();
        //flipBit();

    }
//    public static int flipBit() {
//        int value = 2;
//        int bitIndex = 6;
//        System.out.println(value^(1 << bitIndex-1)); // put your implementation here
//        return value^(1 << bitIndex-1);
//    }
//    public static void Tutorial() throws Exception {
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
//        for (byte b : digest) {
//            System.out.printf("%02x", b);
//        }
//
//
//    }
//    public static void Simple(){
//        double hex = 0x0bp3;
//        System.out.println(hex);
//    }

}
