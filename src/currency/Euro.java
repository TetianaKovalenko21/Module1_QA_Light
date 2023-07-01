package currency;

public class Euro extends Currency implements IsFreeConverted, IsCryptoCurrency {

    public Euro(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }

    @Override
    public boolean isCryptoCurr() {
        return false;
    }
}
