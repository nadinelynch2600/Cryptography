package Cryptography;
import java.security.MessageDigest;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MessageDigestExample {
    public static void main(String[] args) throws Exception {
        // Reading data from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message");
        String Message = sc.nextLine();
        // creating the MessageDigest object
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        //Passing data to the create MessageDigest object
        md.update(Message.getBytes());
        // compute the message digest
        byte[] digest = md.digest();
        //noinspection ImplicitArrayToString
        System.out.println(digest);
        // converting the byte array in to HexString format
        //noinspection StringBufferMayBeStringBuilder
        StringBuffer hexString = new StringBuffer();
        //noinspection Convert2streamapi
        IntStream.iterate(digest.length - 1, i -> i >= 0, i -> i - 1).forEach(i -> {
            ;
        });
        int i = 0;
        hexString.append(Integer.toHexString(0xFF & digest[i]));
        System.out.println("Hex format : " + hexString);
    }
}