package com.company.stringProblems;

import java.util.Arrays;

/**
 * Created by user on 16.08.2017
 */
public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("кума", "мука"));
        System.out.println(isAnagram("school master","the classroom"));
        System.out.println(isAnagram("568", "yhl"));
    }
    void Anagrams(){
        System.out.println("fghj");
    }
    static boolean isAnagram(String string1, String string2) {
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
