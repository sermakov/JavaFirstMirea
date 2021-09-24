package ru.mirea.task5.lab3.dog;

public class FlyingDog extends Dog {
    private float flightSpeed = 0;

    public FlyingDog(float age, float flightSpeed) {
        super(age);
        this.flightSpeed = flightSpeed;
    }

    public float getFlightSpeed() {
        return flightSpeed;
    }

    public void setFlightSpeed(float flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    @Override
    public String toString() {
        return "FlyingDog{" +
                "flightSpeed=" + flightSpeed + super.toString() +
                '}';
    }
}

