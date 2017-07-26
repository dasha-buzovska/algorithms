package com.company;

/**
 * Created by user on 25.07.2017
 */
public class SquaresFromMatches {
    public static void main(String[] args) {
        System.out.println(getNumberOfMatches(4));
    }

    static int getNumberOfMatches(int squareNumber) {
        int sumOfMatches = 0;
        int intSqrt = (int) Math.sqrt(squareNumber);
        int currentNumber = intSqrt * intSqrt;
        sumOfMatches += (intSqrt + 1) * intSqrt * 2;
        int squareDifference = squareNumber - currentNumber;
        if (squareDifference == 0) {
            return sumOfMatches;
        }
        int extraMatch = squareDifference/intSqrt;
        sumOfMatches += squareDifference * 2 + 1 + extraMatch;
        return sumOfMatches;
    }
}
