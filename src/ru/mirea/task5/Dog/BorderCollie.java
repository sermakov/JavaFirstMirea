package ru.mirea.task5.Dog;

class BorderCollie extends Dog {
    private String titul;
    public BorderCollie (String name, int age, String sex, String titul) {
        super(name, age, sex);
        this.titul = titul;
    }
    public void displayInfo() {
        System.out.print("Breed: collie. Name: "  + getName() + " (" + titul +"). Gender: " + sex);
    }
}
