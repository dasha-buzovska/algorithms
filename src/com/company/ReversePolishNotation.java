package com.company;

import java.util.LinkedList;

/**
 * Created by user on 15.08.2017
 */
class ReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(parse("10 20 + 30 40 + *")); //2100
        System.out.println(parse("10 20 30.0 * +")); //610
        System.out.println(parse("10 20 30 () +"));
        System.out.println(parse("10 20 Е * +"));
        System.out.println(parse("0 0 /"));
        System.out.println(parse("10 * 6 7 +"));
        System.out.println(parse("10 0 / 10 20 +"));
        System.out.println(parse(""));
    }
    static double parse(String rpnString) throws RPNParserException {
        String[] args = rpnString.split(" ");
        LinkedList<Double> listOfNumber = new LinkedList<>();
        for (int i = 0; i < args.length; i++) {
            if (isNumeric(args[i])) {
                listOfNumber.add(Double.parseDouble(args[i]));
            } else {
                Double buffer1 = listOfNumber.getLast();
                listOfNumber.removeLast();
                if (listOfNumber.size() == 0) {
                    throw new RPNParserException();
                }
                Double buffer2 = listOfNumber.getLast();
                listOfNumber.removeLast();
                listOfNumber.add(calculate(buffer2, buffer1, args[i]));
            }
        }
        if (listOfNumber.size() > 1) {
            throw new RPNParserException();
        }
        return listOfNumber.getLast();
    }

    static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    static double calculate(double a, double b, String operation) throws RPNParserException {
        if (operation.equals("+")) {
            return a + b;
        } else if (operation.equals("-")) {
            return a - b;
        } else if (operation.equals("*")) {
            return a * b;
        } else if (operation.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException();
            } else {
                return a / b;
            }
        } else {
            throw new RPNParserException();
        }
    }


}
