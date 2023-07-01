package lesson_4;

public class MainClassString {
    public static void main(String[] args) {
        String testString = "Test String. ";
        String testString2 = new String("Test String. ");
        String testString3 = "Test String. ";

        System.out.println(testString);
        System.out.println(testString3);
        testString = "test";
        System.out.println(testString);
        System.out.println(testString3);
        String var = "test";
        System.out.println("---------------");
        System.out.println(testString3.toUpperCase());
        System.out.println(testString3.toLowerCase());
        System.out.println(testString3);

        String str = "test";
        String str2 = new String ("test");

        if (str == str2){
            System.out.println(str + " Equals " + str2);
        }else {
            System.out.println(str + " Not Equals " + str2);
        }
        if (str.equals(str2)){
            System.out.println(str + " Equals " + str2);
        }else {
            System.out.println(str + " Not Equals " + str2);
        }
        boolean eq = "Test".equals("test"); // false
        System.out.println(eq);
        "Test".equalsIgnoreCase("test"); //true
        "Test".toLowerCase().equals("test".toLowerCase()); //true

        String ourString = "  Test test  ".trim(); // 'Test test'
        System.out.println(ourString);
        String[] words = ourString.split(" ");
        System.out.println("Number of words " + words.length);
        System.out.println("   Test test    ".trim().split(" ").length);
        System.out.println("    Space test   ".replace(" ", ""));

        System.out.println(" test,,test1,test2".split(",").length);

        String varString = " test,,teat1\",test2  ";
        System.out.println("pp \" Zirochka\"");
        String[] wordsMassive =
                varString.trim().replace(" ","").replace("\"","").split(",");
        for (int i = 0; i < wordsMassive.length; i++) {
            if (wordsMassive[i].length() != 0){
                System.out.println(wordsMassive[i]);
            }
        }


    }
}
