package currency;

import java.awt.*;

public class MenuCurrency extends Menu {
    public static void printCurrencyMenu() {
        System.out.println("");
        System.out.println("Choose currency:");
        System.out.println("1. Dollar");
        System.out.println("2. Euro");
        System.out.println("3. Uz Som");
        System.out.println("4. Bitcoin");
        System.out.println("100: for Exit");
        System.out.println("Enter your choice:");
    }

    public static Currency setCurrency(int numberOfCurrency){
        Currency tempCurrency = null;
        switch (numberOfCurrency){
            case 1:
//                System.out.println("Dollar");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");
                break;
            case 2:
//                System.out.println("Euro");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Euro");
                break;
            case 3:
//                System.out.println("Som");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Som");
                break;
            case 4:
//                System.out.println("Bitcoin");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("Bitcoin");
                break;
            default:
                System.out.println("Default currency : Dollar");
                tempCurrency = ListOfCurrency.getCurrencyHashMap().get("USD");
        }

        return tempCurrency;
    }

}
