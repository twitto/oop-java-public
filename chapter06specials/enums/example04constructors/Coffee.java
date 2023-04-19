package chapter06specials.enums.example04constructors;

public enum Coffee
{
    ESPRESSO(5), AMERICANO(8), LATTE(10),
    MACCHIATO(11), CAPPUCCINO(12), MOCHA(15),
    ICED_COFFEE(18), IRISH_COFFEE(20);

    private final double price;

    Coffee(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
}

