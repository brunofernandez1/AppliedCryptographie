package Haenni.Exercises2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruno on 11.03.2018.
 * Method to run the euler function
 */
public class EulerFunction {
    public static void main(String[] args) {

        System.out.println(isPrime(9));

    }

    public static boolean isPrime(int number){
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int i=number; i>1; i--){
            int temp = number % i;
            if (temp == 0){
                divisibleNumbers.add(i);
            }
        }
        System.out.println(divisibleNumbers);
        if (divisibleNumbers.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

}
