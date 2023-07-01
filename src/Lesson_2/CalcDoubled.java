package Lesson_2;

public class CalcDoubled {
    public int sumDoubled(int dodanok, int dodanok2) {
        int result = (dodanok + dodanok2) * 2;
        System.out.println("Result doubled " + dodanok + " + " + dodanok2 + " = " + result);
        return result;
    }

    public String sumDoubled(String dodanok1, String dodanok2) {
        String result = dodanok1 + dodanok2 + dodanok1 + dodanok2;
        System.out.println("Result doubled " + dodanok1 + " + " + dodanok2 + " = " + result);
        return result;
    }

    public String sumDoubled(int dodanokInt, String dodanokString) {
        String result = dodanokInt + dodanokString + dodanokInt + dodanokString;
        System.out.println("Result doubled " + dodanokInt + " + " + dodanokString + " = " + result);
        return result;
    }

    // "345" + 7
    public int sumDoubled(String dodanokString, int dodanokInt){
        try {
            int result = (Integer.parseInt(dodanokString) + dodanokInt) * 2;
            System.out.println("Result doubled " + dodanokString + " + " + dodanokInt + " = " + result);
            return result;
        }catch (NumberFormatException e){
            System.out.println("ERROR " + e);
            return 888;
        }catch (Exception e){
            System.out.println("Error " + e);
            System.out.println("Returned " + 999);
            return 999;
        }finally {
            System.out.println(" Block finally");
        }
    }
}
