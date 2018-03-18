package Hassenstein.Exercises3;

import java.util.Random;

public class Randomizing {
    //create random bytes with java Random
    public static void main(String[] args) {
        Random myrand = new Random();
        //myrand.setSeed(12542745);

        byte[] mybytes = new byte[256];

        myrand.nextBytes(mybytes);
        for (int i = 0; i< mybytes.length; i++){
            System.out.println(mybytes[i]);
        }
    }
}
