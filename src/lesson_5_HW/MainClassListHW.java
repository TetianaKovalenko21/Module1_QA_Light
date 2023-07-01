package lesson_5_HW;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassListHW {
    public static void main(String[] args) {
        System.out.println("------MAX--------");
        ArrayList<Integer> list_1 = new ArrayList();
        ArrayList<Integer> list_2 = new ArrayList<>();
        list_1.add(100);
        list_1.add(2);
        list_1.add(33);
        list_1.add(34);
        list_1.add(-2);
        list_1.add(56);
        list_1.add(307);
        list_1.add(10);
        list_1.add(11);
        System.out.println(list_1);
        System.out.println(Collections.max(list_1)); //check ready done method
        ListMethods.maxListValue(list_1);
        ListMethods.maxListValue(list_2); //check empty list

        System.out.println("------REVERSE--------");
        System.out.println(list_1);
        ListMethods.reverse(list_1);
        System.out.println();
        ArrayList<String> list_3 = new ArrayList();
        list_3.add("Test_1");
        list_3.add("Test_2");
        list_3.add("");
        list_3.add("Test_4");
        System.out.println(list_3);
        ListMethods.reverse(list_3);

    }
}
