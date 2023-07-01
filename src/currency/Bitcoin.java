package currency;

public class Bitcoin extends Currency implements IsCryptoCurrency{

    public Bitcoin(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Bitcoin";
    }


    @Override
    public boolean isCryptoCurr() {
        return true;
    }

    public double exchangeGrnToCurrency(double numberOfGrn) {
        System.out.println("Obmin zaboronenuy NazBankom");
        return numberOfGrn;
    }

}
