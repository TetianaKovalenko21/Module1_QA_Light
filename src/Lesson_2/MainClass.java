package Lesson_2;

public class MainClass {
    public static void main(String[] args) {
//          int rez_1 = subtractionDoubled(int q, int x);
//          String rez_2 = sumDoubled (String, String);
//          String rez_11 = sumDoubled (int, String);
//          int rez_3 = sumDoubled (String, int)

        CalcDoubled calcDoubled = new CalcDoubled();
        int rez_1 = calcDoubled.sumDoubled(23, 22);
        String rez_2 = calcDoubled.sumDoubled("Test", "Taras");
        String rez_11 = calcDoubled.sumDoubled(3, "test");
        int rez_3 = calcDoubled.sumDoubled("345", 7);
        rez_3 = calcDoubled.sumDoubled("34a5", 7);
        System.out.println(rez_3);
        
        System.out.println("--- The end ---");

    }
}