package ru.mirea.task13.exe1;

public class Item {
    public int id;
    public double value;

    public Item(){
        id = 0;
        value = 0;
    }

    public Item(int id, double value){
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
