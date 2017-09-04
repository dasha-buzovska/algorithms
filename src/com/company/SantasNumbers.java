package com.company;

/**
 * Created by user on 04.09.2017
 */
import java.util.ArrayList;

public class SantasNumbers {

    public static int findNumber(int start, int number) {
        int[] array = new int[number];
        for (int i = 1; i <= number; i++) {
            array[i - 1] = i;
        }

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0) {
                for (int j = array[i]*2-1; j < array.length; j+=array[i]) {
                    array[j] = 0;
                }
                String str = array[i] + "";
                if (!str.contains("13") && array[i] > start)
                primes.add(array[i]);
            }
        }
        return primes.size();
    }
}

