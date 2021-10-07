public class Human
{

    public class Head
    {
        String hair_color;
        String form;
        String eye_color;

        public Head(String hair_color, String form, String eye_color)
        {
            this.hair_color = hair_color;
            this.form = form;
            this.eye_color = eye_color;
        }

        public String getHair_color()
        {
            return hair_color;
        }

        public void setHair_color(String hair_color)
        {
            this.hair_color = hair_color;
        }

        public String getForm()
        {
            return form;
        }

        public void setForm(String form)
        {
            this.form = form;
        }

        public String getEye_color()
        {
            return eye_color;
        }

        public void setEye_color(String eye_color)
        {
            this.eye_color = eye_color;
        }

        public void getHead()
        {
            System.out.println("Голова:" + "\nЦвет волос: " + hair_color + "\nФорма головы: "+ form + "\nЦвет глаз: " + eye_color + "\n");
        }
    }

    public class Hand
    {
        int number_of_fingers;
        boolean manic;
        String color_manic;

        public Hand(int number_of_fingers, boolean manic, String color_manic)
        {
            this.number_of_fingers = number_of_fingers;
            this.manic = manic;
            if (this.manic == true)
            {
                this.color_manic = color_manic;
            }
            else
            {
                this.color_manic = "Нет";
            }
        }

        public int getNumber_of_fingers()
        {
            return number_of_fingers;
        }

        public void setNumber_of_fingers(int number_of_fingers)
        {
            this.number_of_fingers = number_of_fingers;
        }

        public boolean isManic()
        {
            return manic;
        }

        public void setManic(boolean manic)
        {
            this.manic = manic;
        }

        public void getHand()
        {
            System.out.println("Руки:" + "\nКоличество пальцев: " + number_of_fingers + "\nМаникюр: " + manic + "\nЦвет маникюра: " + color_manic + "\n");
        }
    }

    public class Leg
    {
        int number_of_fingers;
        boolean manic;
        String color_manic;

        public Leg(int number_of_fingers, boolean manic, String color_manic)
        {
            this.number_of_fingers = number_of_fingers;
            this.manic = manic;
            if (this.manic == true)
            {
                this.color_manic = color_manic;
            }
            else
            {
                this.color_manic = "Нет";
            }
        }

        public int getNumber_of_fingers()
        {
            return number_of_fingers;
        }

        public void setNumber_of_fingers(int number_of_fingers)
        {
            this.number_of_fingers = number_of_fingers;
        }

        public boolean isManic()
        {
            return manic;
        }

        public void setManic(boolean manic)
        {
            this.manic = manic;
        }

        public void getLeg()
        {
            System.out.println("Ноги:" + "\nКоличество пальцев: " + number_of_fingers + "\nМаникюр: " + manic + "\nЦвет маникюра: " + color_manic);
        }
    }
}
