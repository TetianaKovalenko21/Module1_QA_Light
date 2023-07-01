package Lesson_1;

public class CalcTemplate {

    /**
     * // This method calculates the sum of two integers and prints the result
     * @param dodanok1
     * @param dodanok2
     */
    public static void sum(int dodanok1, int dodanok2){
        System.out.println("Result from method = " + (dodanok1 + dodanok2) );
    }

    /**
     * This method calculates the sum of two integers, doubles the result, and returns it
      * @param dodanok_1
     * @param dodanok2
     * @return
     */
    public int sumDoubled(int dodanok_1, int dodanok2){
        int tempResult = (dodanok_1 + dodanok2) * 2;
        System.out.println("Result = " + tempResult);
        return tempResult;
    }

}
