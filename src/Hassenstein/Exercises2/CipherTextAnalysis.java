package Hassenstein.Exercises2;

import java.util.HashMap;
import java.util.Map;

public class CipherTextAnalysis {

    public static void main(String[] args) {

        String str = "Eb ukq pdejg paydjkhkcu ywj okhra ukqn oayqnepu lnkxhaio pdaj\n" +
                "ukq zk jkp qjzanopwjz pda lnkxhaio wjz ukq zk jkp qjzanopwjz pda\n" +
                "paydjkhkcu";


        int len = str.length();
        Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));

        for (int i = 0; i < len; ++i)
        {
            char charAt = str.toLowerCase().charAt(i);

            if (!numChars.containsKey(charAt))
            {
                numChars.put(charAt, 1);
            }
            else
            {
                numChars.put(charAt, numChars.get(charAt) + 1);
            }
        }

        System.out.println(numChars);

    }


}
