package lesson_4_HW;

public class MainClassHW {
    public static void main(String[] args) {
        System.out.println("------------------ALL---------------------");

        int a = 5;
        int b = 6;
        int c = 10;
        WorkWithMassive.createMatrix(a, b, c);

        int d = 6;
        int e = 2;
        int f = 21;
        WorkWithMassive.createMatrix(d, e, f);

        WorkWithMassive.createMatrix(-2, 0, 7);

        System.out.println("-----------------LEFT----------------------");

        int[][] start= {
                {1,2,3},
                {1,2,3},
                {1,2,3}};

        WorkWithMassive.fillingOfLeftDiagonal(start, 8);

        System.out.println("-----------------RIGHT----------------------");

        int[][] start1= {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}};

        WorkWithMassive.fillingOfRightDiagonal(start1, 9);

        System.out.println("----------------BOTH-----------------------");

        int[][] start2= {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}};

        WorkWithMassive.fillingBothDiagonal(start2, 5);

        System.out.println("----------------NOT_SQUARE-----------------------");

        int[][] start3= {
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3},
                {1,2,3,4}};

        WorkWithMassive.fillingOfRightDiagonal(start3, 10);
        WorkWithMassive.fillingOfLeftDiagonal(start3, 10);
        WorkWithMassive.fillingBothDiagonal(start3, 10);
    }
}
