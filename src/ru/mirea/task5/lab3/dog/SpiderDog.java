package ru.mirea.task5.lab3.dog;

public class SpiderDog extends Dog {
    private float amountOfWeb = 0;

    public SpiderDog(float age, float amountOfWeb) {
        super(age);
        this.amountOfWeb = amountOfWeb;
    }

    public float getAmountOfWeb() {
        return amountOfWeb;
    }

    public void setAmountOfWeb(float amountOfWeb) {
        this.amountOfWeb = amountOfWeb;
    }

    @Override
    public String toString() {
        return "SpiderDog{" +
                "amountOfWeb=" + amountOfWeb + super.toString() +
                '}';
    }
}

