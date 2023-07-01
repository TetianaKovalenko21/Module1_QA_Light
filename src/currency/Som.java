package currency;

public class Som extends Currency implements IsFreeConverted, IsCryptoCurrency{
    public Som(double externalKursNBU) {
        super(externalKursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Som";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }

    @Override
    public boolean isCryptoCurr() {
        return false;
    }
}
