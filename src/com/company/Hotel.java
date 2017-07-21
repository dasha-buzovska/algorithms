package com.company;

class Hotel {

    static int[][] createTable(int tableSize) {
        int[][] array = new int[tableSize][tableSize];
        int counter = 0;
        for (int i = tableSize - 1; i >= 0; i--) {
            int diagonalIndexColumn = i, diagonalIndexRow = 0;
            while (diagonalIndexColumn <= tableSize - 1) {
                counter++;
                array[diagonalIndexRow][diagonalIndexColumn] = counter;
                diagonalIndexColumn++;
                diagonalIndexRow++;
            }
        }

        for (int i = 1; i < tableSize; i++) {
            int diagonalIndexRow = i, diagonalIndexColumn = 0;
            while (diagonalIndexRow <= tableSize - 1) {
                counter++;
                array[diagonalIndexRow][diagonalIndexColumn] = counter;
                diagonalIndexColumn++;
                diagonalIndexRow++;
            }
        }
        return array;
    }
}