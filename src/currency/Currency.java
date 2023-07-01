package currency;

import java.text.DecimalFormat;

abstract public class Currency {
    private double kursNBU;
    public double marga = 1.1; //10% zarobitok

    DecimalFormat df = new DecimalFormat("0.00");

    public Currency(double externalKursNBU) {
        kursNBU = externalKursNBU;
        setMarga(marga);
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
        if (!(this instanceof IsFreeConverted)) {
            this.marga = marga * 1.2;
            System.out.println(getCurrencyName() + " is Not real currency!!");
            System.out.println("So marga is changed. Current marga = " + df.format(this.marga));
        } else {
            if ((((IsFreeConverted) this).isFreeConv() == false)) {
                this.marga = marga * 1.1;
                System.out.println(getCurrencyName() + " is Not Free converted to currency");
                System.out.println("So marga is changed. Current marga = " + df.format(this.marga));
            }
        }
    }

    public double getKursBuy() {
        return kursNBU * marga;
    }

    public double getKursSell() {
        return kursNBU / marga;
    }

    abstract String getCurrencyName();

    public double exchangeGrnToCurrency(double numberOfGrn) {
        Double tempResult = numberOfGrn / getKursBuy();
        System.out.println(String.format("For %s Grn you get %s %s by kurs %s (marga %s)", numberOfGrn, df.format(tempResult), getCurrencyName(), df.format(getKursBuy()), df.format(getMarga())));
        return tempResult;
    }

    public double exchangeCurrencyToGrn(double numberOfCurrency) {
        Double tempResult = numberOfCurrency * getKursSell();
        System.out.println(String.format("For %s %s you get %s Grn by kurs %s (marga %s)", numberOfCurrency, getCurrencyName(), df.format(tempResult), df.format(getKursSell()), df.format(getMarga())));
        return tempResult;
    }

}
