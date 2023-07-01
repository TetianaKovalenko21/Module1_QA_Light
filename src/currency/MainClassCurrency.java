package currency;

public class MainClassCurrency {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(28.2);
        System.out.println(dollar.getKursNBU());
        dollar.setKursNBU(29.0);
        System.out.println(dollar.getKursNBU());

        System.out.println(dollar.getMarga());

        dollar.exchangeGrnToCurrency(3000);

        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(41);
        euro.exchangeCurrencyToGrn(100);

        Som som = new Som(0.0001);
        som.exchangeGrnToCurrency(100);

        Bitcoin bitoc = new Bitcoin(0.5);
        bitoc.exchangeCurrencyToGrn(30);
        bitoc.exchangeGrnToCurrency(1500);
        System.out.println(bitoc.getCurrencyName());

    }
}
