package ru.mirea.task5.opt3;

public class Sofa extends Furniture {
    private int seatsAmount;
    private boolean pullOut;

    public Sofa() {
        this(3, true);
    }

    public Sofa(int seatsAmount, boolean pullOut) {
        super(120.0f, 341, "Велюр, ППУ");
        this.seatsAmount = seatsAmount;
        this.pullOut = pullOut;
    }

    public Sofa(float weight, int cost, String materialType, int seatsAmount, boolean pullOut) {
        super(weight, cost, materialType);
        this.seatsAmount = seatsAmount;
        this.pullOut = pullOut;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    public boolean isPullOut() {
        return pullOut;
    }

    public void setPullOut(boolean pullOut) {
        this.pullOut = pullOut;
    }

    @Override
    public String toString() {
        return ("Это" + (pullOut ? "" : " не")     + " раздвижной тип дивана"
                + "\nКоличество мест дивана: "      + seatsAmount
                + "\nМатериалы дивана: "            + super.getMaterialType()
                + "\nЦена дивана: "                 + super.getCost() + " USD"
                + "\nВес дивана: "                  + super.getWeight()) + " кг";
    }
}
