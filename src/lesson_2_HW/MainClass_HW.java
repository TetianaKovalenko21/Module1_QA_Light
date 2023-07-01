package lesson_2_HW;

import Lesson_2.CalcDoubled;

public class MainClass_HW {

//          x = 5, y = 10 , z = 15, q = 20
//          rez = (((q - x) * 2 - y)*2  / z )*2
//          int rez_1 = subtractionDoubled(int q, int x)
//          int rez_2 = subtractionDoubled (rez_1, y)
//          double rez = divisionDoubled(rez_2, z)
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        int z = 15;
        int q = 20;
        int c = 0;
        int rez_s_1 = Calc_HW.subtractionDoubled(q, x);
        double rez_s_2 = Calc_HW.subtractionDoubled(rez_s_1, y);
        Calc_HW calcHw = new Calc_HW();
        double rez = calcHw.divisionDoubled(rez_s_2, z);
        int check = calcHw.divisionDoubled(rez_s_1, c);

        System.out.println("--- The end of my HW, thank you for knowledge---");

    }
}
