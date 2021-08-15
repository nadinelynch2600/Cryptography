package Cryptography;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import java.security.Key;
import java.security.SecureRandom;

public class MacSample {
    private static Object KeyGen;

    public static void main(String[] args) throws Exception {
        // Creating a KeyGenerator object
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        // Creating a SecureRandom object
        SecureRandom secRandom = new SecureRandom();
        // Initializing the KeyGenerator
        keyGen.init(secRandom);
        // creating/Generating a key
        Key key = keyGen.generateKey();
        // creating a Mac object
        Mac mac = Mac.getInstance("HmacSHA256");
        // initializing the Mac object
        mac.init(key);
        // computing the Mac
        String msg = "hi, how are you";
        byte[] bytes = msg.getBytes();
        byte[] macResult = mac.doFinal(bytes);

        System.out.println("Mac result: ");
        System.out.println(new String(macResult));
    }
}