package ru.mirea.task2.Task2_3;

public class Ball {
    private String ballName = "Ball";

    public Ball(String ballName) {
        this.ballName = ballName;
    }

    public String getName() {
        return ballName;
    }

    public void setName(String ballName) {
        this.ballName = ballName;
    }

    public String toString() {
        return "Ball: " + getName();
    }
}
