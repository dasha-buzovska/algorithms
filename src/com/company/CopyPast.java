package com.company;

/*В детский сад поступила новая обучающая компьютерная программа. Конечно, дети сразу же об этом узнали и хотят
как можно скорее в неё поиграть. Для этого надо скопировать её на все N имеющихся компьютеров Сейчас программа
есть только на одном компьютере, остальные компьютеры не имеют дисководов и не объединены в локальную сеть.
Единственный способ передать информацию с одного компьютера на другой — скопировать её, используя нуль-модем
(провод, соединяющий два компьютера напрямую). Таким образом, с любого компьютера, где уже установлена программа
 можно скопировать её на какой-то другой (но только на один) всего за один час. В садике есть всего K нуль-модемных шнуров.
 Ваша задача по заданным числам N и K оценить минимальное время, необходимое для копирования программы на все
 имеющиеся компьютеры.*/

public class CopyPast {
    public static void main(String[] args) {
        System.out.println(calculateHours(13, 4));

    }

    public static int calculateHours(int computers, int modems) {
        int computersWithPrograms = 1, hours = 0, possibleCopyCounts = 1;
        while (possibleCopyCounts <= modems && computersWithPrograms < computers && computersWithPrograms < modems) {
            computersWithPrograms += possibleCopyCounts;
            hours++;
            possibleCopyCounts = computersWithPrograms;
        }
        hours += Math.ceil((double) (computers - computersWithPrograms) / modems);
        return hours;
    }
}