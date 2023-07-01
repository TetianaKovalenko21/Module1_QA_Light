package lesson_2_HW;

public class Calc_HW {
    public static int multiplicationDoubled(int factor1, int factor2) {
        int result = (factor1 * factor2) * 2;
        System.out.println("Result multiplication doubled " + factor1 + " * " + factor2 + " = " + result);
        return result;
    }

    public static int subtractionDoubled(int minuend, int subtrahend) {
        int result = (minuend - subtrahend) * 2;
        System.out.println("Result subtraction doubled " + minuend + " - " + subtrahend + " = " + result);
        return result;
    }


    public int divisionDoubled(int dividend, int divider) {
        try {
            int result = (dividend / divider) * 2;
        System.out.println("Result division (int) doubled " + dividend + " / " + divider + " = " + result);
        return result;
        } catch (ArithmeticException a) {
            System.out.println("!!!Error - division by zero!!!");
            return 88888;
        }catch (Exception e) {
            System.out.println("ERROR " + e);
            return 99999;
        }

    }

    public double divisionDoubled(double dividend, double divider) {
        double result = (dividend / divider) * 2;
        System.out.println("Result division (double) doubled " + dividend + " / " + divider + " = " + result);
        return result;
    }
}

