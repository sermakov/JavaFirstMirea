package ru.mirea.task11.lab6;

public class Lab6 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                Game.run();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                SecondApp.run();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                ThirdApp.run();
            }
        }.start();
    }
}
