package lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassList {
    public static void main(String[] args) {
        List<String> list_1 = new ArrayList();
        System.out.println(list_1);
        list_1.add("Test_1");
        System.out.println(list_1);
        list_1.add("Test_2");
        list_1.add("");
        list_1.add("Test_4");
        System.out.println(list_1);
        System.out.println("Line 2 = " + list_1.get(1));
        list_1.add(0, "Test_0");
        System.out.println(list_1);
        list_1.set(1, "Test_11");
        System.out.println(list_1);
        list_1.set(2, list_1.get(2) + "222");
        System.out.println(list_1);
       // System.out.println(list_1.get(5));
        list_1.remove(1);
        System.out.println(list_1);
        System.out.println("-------------");
        for (int i = 0; i < list_1.size(); i++) {
            System.out.println(i + 1 + "." + list_1.get(i));
        }
        System.out.println("----");
        for (String element: list_1) {
            System.out.println(element);
        }
        System.out.println("-------------");

        ArrayList<Integer> list_2_int = new ArrayList<>();
        list_2_int.add(22);
        list_2_int.add(11);
        list_2_int.add(66);
        list_2_int.add(44);
        System.out.println(list_2_int);
        System.out.println(Collections.min(list_2_int));
        Collections.sort(list_2_int);
        System.out.println(list_2_int);
        Collections.reverse(list_2_int);
        System.out.println(list_2_int);

        Calc.returnValue(5);
        System.out.println("---The end---");

    }
}
