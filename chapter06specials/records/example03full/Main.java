package chapter06specials.records.example03full;

public class Main
{
    public static void main(String[] args)
    {
        // Create some sample addresses
        Address address1 = new Address("Tel Aviv", "Dizengoff", "100", "5", 6437105, "Israel");
        Address address2 = new Address("New York", "Broadway", "123", 10019, "USA");
        Address address3 = new Address("Paris", "Champs-Elysees", "1", 75008, "France");

        // Use some of the Address methods
        System.out.println("Address 1 has an apartment: " + address1.hasApartment());
        System.out.println("Address 2 has an apartment: " + address2.hasApartment());
        System.out.println("Address 3 has an apartment: " + address3.hasApartment());

        System.out.println("Postal code 1234567 is valid: " + Address.isValidPostalCode(1234567));
        System.out.println("Postal code 12345678 is valid: " + Address.isValidPostalCode(12345678));

        System.out.println("Address 1 is in Israel: " + address1.isInIsrael());
        System.out.println("Address 2 is in Israel: " + address2.isInIsrael());

        System.out.println("Full address 1: " + address1.getFullAddress());
        System.out.println("Full address 2: " + address2.getFullAddress());
        System.out.println("Full address 3: " + address3.getFullAddress());
    }
}
