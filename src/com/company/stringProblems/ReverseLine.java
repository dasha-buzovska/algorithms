package com.company.stringProblems;

/**
 * Created by user on 16.08.2017
 */
public class ReverseLine {
    public static void main(String[] args) {
        System.out.println(reverse("ecgfd"));
        System.out.println(reverse("rgpism"));
    }

    static String reverse(String string) {
        String[] letters = string.split("");
        for (int i = 0; i < letters.length/2; i++) {
            String temp = letters[i];
            letters[i] = letters[letters.length - 1 - i];
            letters[letters.length - 1 - i] = temp;
        }
        string = String.join("", letters);
        return string;
    }
}
