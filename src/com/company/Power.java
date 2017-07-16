package com.company;
/*Даны целые числа N, M и Y. Напишите программу, которая найдёт все целые числа X в диапазоне [0, M – 1], такие что XN mod M = Y.
* Выведите все числа X через пробел в одной строке. Числа должны идти в порядке возрастания. Если искомых чисел нет, выведите −1.
* Пример
исходные данные	        результат
    2 6 4                  2 4*/

class Power {

    public static void main(String[] args) {
	    power(2,24,4);
    }

    private static void power(int startInterval, int endInterval, int difference) {
        int indicator = 0;
        for (int i = startInterval; i < endInterval; i++) {
            if (Math.pow(i,2)%endInterval == difference) {
                System.out.print(i + " ");
                indicator = 1;
            }
        }
        if (indicator == 0) {
            System.out.print(-1);
        }
    }
}
