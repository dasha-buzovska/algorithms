package com.company;

/**
 * Created by user on 03.08.2017
 */
public class BinarySearching {
    public static void main(String[] args) throws Exception{

        int data[] = { 1, 7, 15, 23, 28, 35, 66, 76, 81, 86 };
        int numberToFind = 23;
        int result = -1;

        int currentLength = data.length, middleOfArray = data.length/2;
        int firstPosition = 1, lastPosition = data.length - 2;
        if (numberToFind == data[0]) {
            result = 0;
        } else if (numberToFind == data[data.length - 1]) {
            result = data.length - 1;
        } else if (numberToFind > data[0] && numberToFind < data[data.length - 1])  {
            while (currentLength > 1) {
                if (numberToFind <= data[middleOfArray]) {
                    lastPosition = middleOfArray - 1;
                } else {
                    firstPosition = middleOfArray;
                }
                currentLength = lastPosition - firstPosition;
                result = middleOfArray;
                middleOfArray = (lastPosition - firstPosition) / 2 + firstPosition;
            }
        }
        System.out.println(result);
        Boolean h = new Boolean("false");
    }
}
