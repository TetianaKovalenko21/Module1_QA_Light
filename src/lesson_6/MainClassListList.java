package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class MainClassListList {
    public static void main(String[] args) {
        List<List<String>> listlist = new ArrayList<>();
        listlist.add(new ArrayList<>());
        System.out.println(listlist);
        listlist.get(0).add("Test00");
        listlist.add(new ArrayList<>());
        listlist.get(1).add("Test10");
        listlist.get(0).add("Test01");
        System.out.println(listlist);
        listlist.add(0, new ArrayList<>());
        System.out.println(listlist);
        listlist.get(0).add("Test");
        System.out.println(listlist);
      //  listlist.get(0).add(3, "testdd"); Exception
        System.out.println(listlist.get(1));
        System.out.println(listlist.get(1).get(0));
        listlist.get(1).add(1, "TestNew");
        System.out.println(listlist);
        listlist.get(1).set(1, "NewTest");
        System.out.println(listlist);
        listlist.add(new ArrayList<>());
        listlist.add(new ArrayList<>());
        listlist.get(4).add("Test50");
        System.out.println(listlist);
        listlist.remove(2);
        System.out.println(listlist);
        listlist.get(1).remove(0);
        System.out.println(listlist);

        List<String> addList = new ArrayList<>();
        addList.add("Value1");
        addList.add("Value2");
        System.out.println(addList);

        listlist.add(new ArrayList<>());
        listlist.get(4).addAll(addList);
        System.out.println(listlist);

        addList.add("Value3");
        System.out.println(addList);
        listlist.add(addList);
        System.out.println(listlist);

        System.out.println("-------------");
        for (List<String> row: listlist) {
            System.out.println(row);
        }

    }
}
