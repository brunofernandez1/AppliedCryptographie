package Haenni.Exercises2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruno on 11.03.2018.
 * Method to run the euler function
 */
public class EulerFunction {
    public static void main(String[] args) {

        System.out.println(primFactors(541));

    }

    public static List<Integer> primFactors(int number){
        List<Integer> primFactors = new ArrayList<>();
        for (int i=number-1; i>1; i--){
            int temp = number % i;
            if (temp == 0){
                primFactors.add(i);
            }
        }
        System.out.println(primFactors);
        if (primFactors.isEmpty()){
            System.out.println("is prim number");
        }
        else {
            System.out.println("is not prim number");
        }
        return primFactors;
    }

    public static List<Integer> euler(int number){
        //todo get euler numbers
        return null;
    }

}
