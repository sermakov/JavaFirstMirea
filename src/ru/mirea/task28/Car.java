package ru.mirea.task28;

public class Car {
    private String id, type;
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door left = new Door(),
            right = new Door();

    public Car() {
        for(int i = 0; i<4; i++) {
            wheel[i]= new Wheel();
        }
    }

    public Car(String type, String id) {
        this.id = id;
        this.type = type;
        for(int i = 0; i<4; i++) {
            wheel[i]= new Wheel();
        }
    }

    public void Horn() {
        System.out.println("Classic car buzzer");
    }

    class Engine{
        boolean start;
        int rpm = 0;
        public void start(){
            start = true;
            rpm = 100;
        }
        public void rev(int rpm){
            if(!start) {
                System.out.println("First start engine");
                return;
            }
            if( rpm < 1) {
                System.out.println("Incorrect rpm");
                return;
            }
            this.rpm = rpm;
        }
        public void stop(){
            start = false;
            rpm = 0;
        }
    }

    class Wheel{
        int psi = 30;
        public void inflare(int psi){
            if (psi >= 100) {
                System.out.println("Your wheel exploded");
                psi = 0;
                return;
            }
            if (psi < 0) {
                System.out.println("You can't do it");
                return;
            }
            this.psi = psi;
        }
    }

    class Window{
        boolean open = false;
        public void rollup(){
            if (open) {
                System.out.println("Your window already opened");
                return;
            }
            open = true;
        }
        public void rolldown(){
            if (!open) {
                System.out.println("Your window already closed");
                return;
            }
            open = false;
        }
    }


    class Door{
        boolean open;
        public Window window = new Window();
        public void open(){
            if (open) {
                System.out.println("Your door already opened");
                return;
            }
            open = true;
        }
        public void close(){
            if (!open) {
                System.out.println("Your door already closed");
                return;
            }
            open = true;
        }
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }


    private class FlyingCar extends Car {
        String type = "Flying Car";
        String id;
        public Engine engine = new Engine();
        public Door left = new Door(),
                right = new Door();
        public FlyingCar(String id) {
            this.id = id;
        }
        @Override
        public void Horn() {
            System.out.println("Flying car buzzer");
        }
    }

    public static void main(String[] args) {
        Car first = new Car("Jeep", "XYZ123");
        Car second = new Car().new FlyingCar("VIK999");

        first.Horn();
        second.Horn();
    }
}
