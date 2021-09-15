package ru.mirea.task5.opt3;

public class Table extends Furniture {
    private float maxTableLoad;
    private int drawersAmount;

    public Table() {
        this(11.0f, 5);
    }

    public Table(float maxTableLoad, int drawersAmount) {
        super();
        this.maxTableLoad = maxTableLoad;
        this.drawersAmount = drawersAmount;
    }

    public Table(float weight, int cost, String materialType, float maxTableLoad, int drawersAmount) {
        super(weight, cost, materialType);
        this.maxTableLoad = maxTableLoad;
        this.drawersAmount = drawersAmount;
    }

    public float getMaxTableLoad() {
        return maxTableLoad;
    }

    public void setMaxTableLoad(float maxTableLoad) {
        this.maxTableLoad = maxTableLoad;
    }

    public int getDrawersAmount() {
        return drawersAmount;
    }

    public void setDrawersAmount(int drawersAmount) {
        this.drawersAmount = drawersAmount;
    }

    @Override
    public String toString() {
        return ("Максимальная нагрузка на письменный стол: "      + maxTableLoad
                + "\nКоличество ящиков в столе: "                 + drawersAmount
                + "\nМатериалы стола: "                           + super.getMaterialType()
                + "\nЦена стола: "                                + super.getCost() + " USD"
                + "\nВес стола: "                                 + super.getWeight()) + " кг";
    }
}
