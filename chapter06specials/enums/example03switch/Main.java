package chapter06specials.enums.example03switch;

public class Main
{
    public static void main(String[] args)
    {
        for (TrafficLight color : TrafficLight.values()) {
            printAction(color);
        }
    }

    public static void printAction(TrafficLight color)
    {
        switch (color) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Slow down!");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
        }
    }
}
//Stop!
//Slow down!
//Go!