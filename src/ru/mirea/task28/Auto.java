package ru.mirea.task28;

public class Auto
{
    public Wheel wheels;
    public Spoiler spoiler;

    public Auto()
    {
        wheels = new Wheel();
    }

    public class Wheel
    {
        public Wheel() {}

        public void colorWheels(String name)
        {
            class Paint
            {
                public Paint(){}
                public void setPaint(String name)
                {
                    color = name;
                }

                public String color;
            }
            Paint paint = new Paint();
            paint.setPaint(name);
            this.name = paint.color;
        }

        private String name;
    }

    public static class Spoiler
    {
        public Spoiler() {}

        public void changeSpoiler(String color)
        {
            Auto.Spoiler newSpoiler = new Spoiler()
            {
                public String getSpoilerColor()
                {
                    return(color);
                }
            };

            name = newSpoiler.getSpoilerColor();
        }

        public String getSpoilerColor()
        {
            return(name);
        }

        private String name;
    }

    public String toString()
    {
        return("Колёса: " + wheels.name + "\n" + "Спойлер: " + spoiler.name + "\n");
    }
}
