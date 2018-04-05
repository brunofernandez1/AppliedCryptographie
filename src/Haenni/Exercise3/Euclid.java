package Haenni.Exercise3;

import java.util.Arrays;

public class Euclid {

    public static void main(String[] args) {
        System.out.println(euclid(174,48));
        System.out.println(euclid(48,48));
        System.out.println(Arrays.toString(extEuclid(45,80)));
        System.out.println(multInv(23, 80));
    }

    public static int euclid(int a, int b){
        //this makes sure that a is always smaller than b
        if (a>b){
            int atemp = b;
            int btemp = a;
            a = atemp;
            b = btemp;
        }

        //euclid beginns here
        int r = b % a;
        if (r == 0){
            return a;
        }
        else {
            return euclid(r, a);
        }
    }

    public static int[] extEuclid(int a, int b){
        //this makes sure that a is always smaller than b
        if (a>b){
            int atemp = b;
            int btemp = a;
            a = atemp;
            b = btemp;
        }

        int r = b % a;
        int q = b / a;

        if (r == 0 ){
            int[] intarray = new int[]{a,1,0};
            return intarray;
        }
        else {
            int[] intarray = extEuclid(r,a);
            return new int[]{intarray[0], intarray[2]-intarray[1]*q, intarray[1]};
        }
    }

    public static int multInv(int a, int n){
        int[] intarray = extEuclid(a, n);
        return intarray[1];
    }
}
