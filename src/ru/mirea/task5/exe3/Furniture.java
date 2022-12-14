package ru.mirea.task5.exe3;

    public abstract class Furniture {
        private double price;
        private String name;
        private String sheating;
        private double size;

        public abstract double getPrice();
        public abstract String getName();
        public abstract String toString();
        public abstract String getSheating();
        public abstract double getSize();

    }
