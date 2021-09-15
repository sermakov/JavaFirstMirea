package ru.mirea.task5.opt3;

public class Closet extends Furniture  {
    private int shelvesAmount;
    private int locksAmount;

    public Closet() {
        this(4, 4);
    }

    public Closet(int shelvesAmount, int locksAmount) {
        super(72.0f, 174, "ЛДСП, Стекло");
        this.shelvesAmount = shelvesAmount;
        this.locksAmount = locksAmount;
    }

    public Closet(float weight, int cost, String materialType, int shelvesAmount, int locksAmount) {
        super(weight, cost, materialType);
        this.shelvesAmount = shelvesAmount;
        this.locksAmount = locksAmount;
    }

    public int getShelvesAmount() {
        return shelvesAmount;
    }

    public void setShelvesAmount(int shelvesAmount) {
        this.shelvesAmount = shelvesAmount;
    }

    public int getLocksAmount() {
        return locksAmount;
    }

    public void setLocksAmount(int locksAmount) {
        this.locksAmount = locksAmount;
    }

    @Override
    public String toString() {
        return ("Количество полок в шкафу: "                      + this.shelvesAmount
                + "\nКоличество замков в шкафу: "                 + this.locksAmount
                + "\nМатериалы стола: "                           + super.getMaterialType()
                + "\nЦена стола: "                                + super.getCost() + " USD"
                + "\nВес стола: "                                 + super.getWeight()) + " кг";
    }
}
