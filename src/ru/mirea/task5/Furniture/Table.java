package ru.mirea.task5.Furniture;

class Table extends Furniture{
    private String type;
    public Table (String company, int price, String type) {
        super(company, price);
        this.type = type;
    }
    public void displayInfo() {
        System.out.println("Table. Company: "  + getCompany() + ". Type: " + type + ". Price: " + price);
    }
}
