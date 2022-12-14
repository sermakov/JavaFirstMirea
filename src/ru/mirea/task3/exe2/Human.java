package ru.mirea.task3.exe2;

public class Human {
    private Head head;
    private Hand hand;
    private Leg leg;
    private char gender;

    Human(char gender, String headShape, double headSize, double handLength, double legLength){
        this.gender = gender;
        head = new Head(headShape, headSize);
        hand = new Hand(handLength);
        leg = new Leg(legLength);
    }

    public class Head{
        private String shape;
        private double size;

        public Head(String shape, double size){
            this.shape = shape;
            this.size = size;
        }

        public double getSize(){
            return size;
        }

        public String getShape(){
            return shape;
        }

        public void setSize(double size){
            this.size = size;
        }

        public void setShape(String shape){
            this.shape = shape;
        }
    }

    public class Hand{
        public double length;
        Hand(double length){
            this.length = length;
        }

        public double getLength(){
            return length;
        }

        public void setLength(double length){
            this.length = length;
        }
    }

    public class Leg{
        public double length;

        public Leg(double length){
            this.length = length;
        }

        public double getLength(){
            return length;
        }

        public void setLength(double length){
            this.length = length;
        }
    }

    @Override
    public String toString(){
        return "gender: " + gender + " head shape: " + head.getShape() + " head size: " + head.getSize() + " hand length: " + hand.getLength() + " leg length: " + leg.getLength();
    }
}
