package lesson_4_HW;

import static java.lang.Math.abs;

public class WorkWithMassive {

    public static void printMatrixMethod(int[][] matrixForPrinting) {
        System.out.println();
        for (int i = 0; i < matrixForPrinting.length; i++) {
            for (int j = 0; j < matrixForPrinting[i].length; j++) {
                System.out.print(matrixForPrinting[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] createMatrix(int stroka, int stolbez, int value) {
        if (stroka == 0){
            System.out.println("Stroka can't be 0, so it will be 1");
            stroka = 1;
        }
        if (stolbez == 0){
            System.out.println("Stolbez can't be 0, so it will be 1");
            stolbez = 1;
        }
        if (stroka < 0){
            System.out.println("Stroka can't be <0, so it will be |Stroka|");
            stroka = abs(stroka);
        }
        if (stolbez < 0){
            System.out.println("Stolbez can't be <0, so it will be |Stolbez|");
            stolbez = abs(stolbez);
        }
        int[][] matrix = new int[stroka][stolbez];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }

        printMatrixMethod(matrix);
        return matrix;
    }

    public static boolean isSquare(int[][] matrixForCheck) {
        boolean result = true;
        for (int i = 0; i < matrixForCheck.length; i++) {
            if (matrixForCheck.length != matrixForCheck[i].length) {
                System.out.println("Matrix is not square");
                return false;
            }
        }
        return result;
    }

    public static int[][] fillingOfLeftDiagonal(int[][] matrixStart, int value) {
        if (isSquare(matrixStart)) {
            for (int i = 0; i < matrixStart.length; i++) {
                matrixStart[i][i] = value;
            }
        }
        printMatrixMethod(matrixStart);
        return matrixStart;
    }

    public static int[][] fillingOfRightDiagonal(int[][] matrixStart, int value) {
        if (isSquare(matrixStart)) {
            for (int i = 0; i < matrixStart.length; i++) {
                for (int j = 0; j < matrixStart[i].length; j++) {
                    if (j == matrixStart.length - i - 1) {
                        matrixStart[i][j] = value;
                    }
                }

            }
        }
        printMatrixMethod(matrixStart);
        return matrixStart;
    }

    public static int[][] fillingBothDiagonal(int[][] matrixStart, int value) {
        fillingOfLeftDiagonal(matrixStart, value);
        fillingOfRightDiagonal(matrixStart, value);
        return matrixStart;
    }
}
