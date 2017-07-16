package com.company;
/*Кварталы города Фишбурга имеют квадратную форму. Их ограничивают N авеню, идущих с юга на север, и M улиц,
идущих с востока на запад. Вертолёт взлетел на самом юго-западном перекрёстке и пролетел по прямой до
самого северо-восточного перекрёстка. Над сколькими кварталами он пролетел?
Квартал представляет собой внутреннюю область квадрата (граница квадрата не является частью квартала).
Исходные данные
Ввод содержит N и M, разделённые пробелами. 1 < N, M < 32 000.*/

class cityQuarter {

    static int calculateQuarters(int verticalLine, int horizontalLine) {
        int numberOfQuarters = 0;
        double valueOfHorizontal, fractionalPartOfNumber;
        if (verticalLine == horizontalLine) {
            numberOfQuarters = verticalLine - 1;
            return numberOfQuarters;
        }
        numberOfQuarters += 2;
        int currentWhole = (horizontalLine - 1)/(verticalLine - 1);
        for (int i = 2; i < verticalLine - 1; i++) {
            int nextWhole;
            valueOfHorizontal = (double) (horizontalLine - 1)*i/(verticalLine - 1);
            fractionalPartOfNumber = valueOfHorizontal - ((int)valueOfHorizontal);
            nextWhole = (horizontalLine - 1)*i/(verticalLine - 1);
            if (valueOfHorizontal > nextWhole && nextWhole == currentWhole) {
                numberOfQuarters += 1;
            } else if (nextWhole != currentWhole && fractionalPartOfNumber > 0) {
                numberOfQuarters += 2;
            } else {
                numberOfQuarters*=(verticalLine - 1)/i;
                break;
            }
            currentWhole = nextWhole;
        }
        return numberOfQuarters;
    }
}