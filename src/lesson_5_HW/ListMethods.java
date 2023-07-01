package lesson_5_HW;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListMethods {
    public static int maxListValue(ArrayList<Integer> list) {
        try {
            int max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            System.out.println("Max value is " + max);
            return max;
        } catch (NoSuchElementException e) {
            System.out.println("List is empty " + e);
            return 0;
        } catch (Exception e) {
            System.out.println("ERROR " + e);
            return 0;
        }
    }

    public static ArrayList reverse(ArrayList list) {
        for (int i = 0; i < list.size() / 2; i++) {
            Object var = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, var);
        }
        System.out.println(list);
        return list;
    }
}