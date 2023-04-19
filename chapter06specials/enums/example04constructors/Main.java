package chapter06specials.enums.example04constructors;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Coffee prices: ");
        System.out.println("============= ");

        for (Coffee coffee : Coffee.values()) {
            System.out.println(coffee + ": "
                    + coffee.getPrice() + " NIS");
        }
    }
}
//Output
// Coffee prices:
//=============
//ESPRESSO: 5.0 NIS
//AMERICANO: 8.0 NIS
//LATTE: 10.0 NIS
//MACCHIATO: 11.0 NIS
//CAPPUCCINO: 12.0 NIS
//MOCHA: 15.0 NIS
//ICED_COFFEE: 18.0 NIS
//IRISH_COFFEE: 20.0 NIS
