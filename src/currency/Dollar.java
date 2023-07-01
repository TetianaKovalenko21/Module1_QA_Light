package currency;

public class Dollar extends Currency implements IsFreeConverted, IsCryptoCurrency{
    public Dollar(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "USD";
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
