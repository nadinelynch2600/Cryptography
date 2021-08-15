package Cryptography;
import java.io.*;
import java.security.*;
import java.util.Base64;

public class Masher {
    public static <Base64Encoder> void main(String[] args) throws Exception {
        // check arguments.
        if (args.length != 1) {
            System.out.println("Usage: Masher filename");
            return;
        }
        // Obtain a message digest object.
        MessageDigest md = MessageDigest.getInstance("MD5");
        // Calculate the digest for the given file.
        FileInputStream in = new FileInputStream(args[0]);
        Byte[] Buffer = new Byte[8192];
        int length;
        byte[] buffer = new byte[0];
        while ((length = in.read(buffer)) != -1) ;
        md.update(buffer, 0, length);
        byte[] raw = md.digest();
        // Print out the digest in base64.
        Base64Encoder encoder = (Base64Encoder) new Base64[0];
        String base64 = encoder(raw);
        System.out.println(base64);
    }

    private static String encoder(byte[] raw) {
        return null;
    }
    }

