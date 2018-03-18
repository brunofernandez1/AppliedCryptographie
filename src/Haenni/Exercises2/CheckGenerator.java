package Haenni.Exercises2;

import java.util.ArrayList;

public class CheckGenerator {

    public static void main(String[] args) {


        System.out.println(isGenerator(1, 23));
        System.out.println(isGenerator(2, 23));
        System.out.println(isGenerator(3, 23));
        System.out.println(isGenerator(6, 23));
        System.out.println(isGenerator(7, 23));
        System.out.println(isGenerator(8, 23));
        System.out.println(isGenerator(9, 23));



    }


    /**
     *
     *  formulas needed
     *  p = 2q +1
     *  q = (p-1) / 2
     *
     * @param g - this one has to been checked
     * @param p - must be a safe prime
     * @return
     */
    public static boolean isGenerator(int g, int p){

        //p has to be prime (and safe prime, checked later)
        if (!isPrime(p)){
            return false;
        }

        //check for safe prime
        int q = (p-1) / 2;
        if (!isPrime(q)){ //q has to be also prime
            return false;
        }

        ArrayList<Integer> listOfq = new ArrayList<>();
        //add all integers of q group to a list
        //works only because we have already checked if it's prime
        for (int i = 1 ; i<q ; i++){
            listOfq.add(i);
        }
        System.out.println( listOfq);

        ArrayList<Integer> listOfg = new ArrayList<>();
        //now finally check if g is a generator
        for(int k: listOfq) {
            listOfg.add((int) (Math.pow(g, k) % q));
        }
        System.out.println(listOfg);

        //now we compare both lists
        for (Integer comparator: listOfg) {
                if(!listOfq.contains(comparator)){
                    return false;
                }
                listOfq.remove(comparator);
        }

        return true;
    }

    public static boolean isPrime(int p){
        for (int i = 2; i!=p; i++){
            int result = p % i;
            if (result == 0 ){
                return false;
            }
        }
        return true;
    }
}
