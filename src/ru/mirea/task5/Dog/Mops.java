package ru.mirea.task5.Dog;

class Mops extends Dog {
    private int countEyes;
    public Mops (String name, int age, String sex, int countEyes) {
        super(name, age, sex);
        this.countEyes = countEyes;
    }
    public int getCountEyes() {
        return countEyes;
    }
    public void displayInfo() {
        System.out.println("Breed: pug. Name: " + getName() + ". Quantity of eyes: " + countEyes);
    }
}
