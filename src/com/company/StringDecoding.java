package com.company;


/**
 * Created by user on 14.08.2017
 */
public class StringDecoding {

    static String codeString(String string) {
        String result = "";
        int i = 0;
        while (i < string.length()) {
            int j = i, repeatCounter = 0;
            while (j < string.length() && string.charAt(i) == string.charAt(j) && j < i + 9) {
                repeatCounter++;
                j++;
            }
            result = result.concat(Character.toString(string.charAt(i)));
            if (repeatCounter > 1) {
                result = result.concat("" + repeatCounter);
            }
            i = j;
        }
        return result;
    }
    
    static String decodeString(String string) {
        if (string.length() < 2) {
            return string;
        }
        String result = "";
        int elementIndex = 0;
        while (elementIndex < string.length()) {
            if (elementIndex == string.length() - 1) {
                result = result.concat(Character.toString(string.charAt(elementIndex)));
                return result;
            }
            char item = string.charAt(elementIndex), number = string.charAt(elementIndex + 1);

            if (Character.isDigit(number) && !Character.isDigit(item) && number != '0' && number != '1') {
                for (int i = 0; i < Character.getNumericValue(number); i++) {
                    result = result.concat(Character.toString(item));
                }
                elementIndex += 2;
            } else if (!Character.isDigit(number) && !Character.isDigit(item) && number != item) {
                result = result.concat(Character.toString(item));
                elementIndex++;
            } else {
                return "";
            }
        }
        return result;
    }
}
