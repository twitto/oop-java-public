package chapter06specials.records.example01motivation;

public class Main
{
    public static void main(String[] args)
    {
        PersonClass person1 = new PersonClass("Bob", 20);
        System.out.println(person1.getName()); // prints "Bob"
        System.out.println(person1.getAge()); // prints "22"

        PersonRecord person2 = new PersonRecord("Alice", 23);
        System.out.println(person2.name()); // prints "Alice"
        System.out.println(person2.age()); // prints "25"
    }

}
