package ru.mirea.task29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private float dollar;
    private float euro;
    private float pounds;
    CurrencyInfo(float dollar, float euro, float pounds){
        this.dollar = dollar;
        this.euro = euro;
        this.pounds = pounds;
    }
    public void setDollar(float dollar) {
        this.dollar = dollar;
    }
    public void setEuro(float euro) {
        this.euro = euro;
    }
    public void setPounds(float pounds) {
        this.pounds = pounds;
    }
    public float getDollar() {
        return dollar;
    }
    public float getEuro() {
        return euro;
    }
    public float getPounds() {
        return pounds;
    }
    @Override
    public String toString() {
        return "CurrencyInfo{" + "dollar=" + dollar + ", euro=" + euro + ", pounds=" + pounds + '}';
    }

}
