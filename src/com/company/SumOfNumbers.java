package com.company;

class SumOfNumbers {

    static String findConjunctions(int number) {
        int a = 0, sum = 0, p = 0;
        while (sum!=number) { //можливо написати a < number, краще у вайлі писать < або > замість ==, !=
            sum = 0;
            a++;
            for (p = 0; sum < number; p++) {
                sum += a + p;
            }
        }
        return a + " " + p;
    }
}