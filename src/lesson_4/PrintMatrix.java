package lesson_4;

public class PrintMatrix {
    // 1 2 3
    // 4 5
    // 7 8 9 10
    public static void printMatrixMethod(int[][] matrixForPrinting){
        System.out.println();
        for (int i = 0; i < matrixForPrinting.length; i++) {
            for (int j = 0; j < matrixForPrinting[i].length; j++) {
                System.out.print(matrixForPrinting[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
