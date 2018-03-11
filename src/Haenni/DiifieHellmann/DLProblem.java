package Haenni.DiifieHellmann;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruno on 04.03.2018.
 *
 * Exercise 1
 *
 *
 */
public class DLProblem {

    public static void main(String[] args) {

        breakDiffieHellman(13, 2, 3, 4);
        breakDiffieHellman(11, 2, 9, 1);
        breakDiffieHellman(11, 6, 7, 5);

    }

    /**
     * function looks like
     * A = g^a mod p
     * B = g^b mod p
     *
     * Need to find by bruteforcing
     * B^a mod p = A^b mod p
     *
     * @param p
     * @param g
     * @param A
     * @param B
     * @return
     */

    public static int breakDiffieHellman(int p, int g, int A, int B) {

        List<Integer> listOfas = new ArrayList<>();
        List<Integer> listOfbs = new ArrayList<>();
        boolean found = false;

        //call findPower to find all matching power numbers
        listOfas = findExponent(p, g, A);
        listOfbs = findExponent(p, g, B);

        //loop through both list and compare. Return the matching one
        for (Integer a : listOfas){
            for (Integer b : listOfbs){
                //check if values match and return k
                if ((Math.pow(A, b)% p) == (Math.pow(B, a)% p)){
                    Double k = Math.pow(A, b)% p;
                    System.out.println("k is " + k.intValue());
                    found = true;
                    return k.intValue();
                }
            }
        }
        return 0;
    }

    /**
     *
     * find the exponent number by entering the result, modulo and base
     *
     * @param p
     * @param g
     * @param A
     * @return
     */
    public static List<Integer> findExponent(int p, int g, int A) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < p; i++) {

            Double resulta = Math.pow(g, i) % p;
            if (resulta.intValue() == A) {
                list.add(i);
            }
        }
        return list;
    }
}