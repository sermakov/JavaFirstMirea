package ru.mirea.task3.Dog;

class Mops extends Dog {
    private int counteyes;
    public Mops(String name, int age, String reward, int counteyes) {
        super(name, age, reward);
        this.counteyes = counteyes;
    }
    @Override
    public void displayInfo() {
        System.out.println("Имя собаки: " + super.getName());
        System.out.println("Возраст: " + super.getAge());
        System.out.println("Награды: " + super.getReward());
        System.out.print("Кол-во глаз (у мопсов они могут выпадать): " + counteyes);
    }
}
