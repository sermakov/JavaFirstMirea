package ru.mirea.task3.Dog;

class BorderKolly extends Dog{
    private String titul;
    public BorderKolly(String name, int age, String reward, String titul) {
        super(name, age, reward);
        this.titul = titul;
    }
    public String getTitul() {return titul;}
    @Override
    public void displayInfo() {
        System.out.println("Имя собаки: " + super.getName());
        System.out.println("Возраст: " + super.getAge());
        System.out.println("Родословная: " + titul + " и её награды: " + super.getReward());
    }
}
