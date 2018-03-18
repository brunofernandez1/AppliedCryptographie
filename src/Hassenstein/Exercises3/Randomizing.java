package Hassenstein.Exercises3;

import java.security.SecureRandom;
import java.security.Security;
import java.util.Random;

public class Randomizing {
    public static void main(String[] args) {
        //create random bytes with java Random
        Random myrand = new Random();
        //by using same seed, the bytecode will be everytime the same
        //myrand.setSeed(12542745);

        byte[] mybytes = new byte[256];

        myrand.nextBytes(mybytes);
        for (int i = 0; i< mybytes.length; i++){
            System.out.println(mybytes[i]);
        }

        //create random bytes with Java SecureRandom using Security providers
        SecureRandom mysecrand = new SecureRandom();
        System.out.println(Security.getProviders());

        byte[] secybytes = new byte[256];
        mysecrand.nextBytes(secybytes);

        for (int i = 0; i< secybytes.length; i++){
            System.out.println(secybytes[i]);
        }
    }
}
