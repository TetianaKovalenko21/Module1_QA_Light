package lesson_4_HW;

public class WorkWithString {
    public static void main(String[] args) {
        System.out.println("--------trim--------");
        String hw1 = new String(" Test_.  String, Test1 ,  Part2  ");
        System.out.println("[" + hw1 + "]");
        System.out.println("[" + hw1.trim() + "]");

        System.out.println("------Test--------");
        String[] hw1Massive =
                hw1.replace(" ", "").replace("_", "").replace(".", ",").split(",");
        System.out.println(hw1Massive[0]);

        System.out.println("---------T-----------");
        String hw2 = new String(" Test_.  String, Test1 ,  Part2  ");
        String[] hw2Massive =
                hw2.split(",");

        for (int i = 0; i < hw2Massive.length; i++) {
            if (hw2Massive[i].trim().toLowerCase().startsWith("t")){
                System.out.println("The first symbol is T");
            } else {
                System.out.println("The first symbol is " + hw2Massive[i].trim().charAt(0));
            }
        }
        System.out.println("--------S->Y-----------");
        System.out.println(hw2.replaceFirst("s", "y"));

    }
}
