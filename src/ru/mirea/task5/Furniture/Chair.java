package ru.mirea.task5.Furniture;

class Chair extends Furniture {
    private String country;
    public Chair (String company, int price, String country) {
        super(company, price);
        this.country = country;
    }
    public void displayInfo() {
        System.out.println("Chair. Company: "  + getCompany() + ". Country: " + country + ". Price: " + price);
    }
}
