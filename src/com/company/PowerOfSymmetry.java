package com.company;

/**
 * Created by user on 25.07.2017
 */
public class PowerOfSymmetry {

    static byte getPowerOfSymmetry(int number) {
        String strNumber = "" + number;
        byte result = 0;
        for (int i = 0; i < Math.ceil((float)strNumber.length()/2); i++) {
            if (strNumber.charAt(i) == strNumber.charAt(strNumber.length() - i - 1)) {
                result++;
            }
        }
        return result;
    }
}
