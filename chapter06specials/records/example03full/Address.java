package chapter06specials.records.example03full;

public record Address(String city, String street, String houseNumber, String apartmentNumber, int postalCode,
                      String country)
{

    private static final int MIN_POSTAL_CODE = 1000000;
    private static final int MAX_POSTAL_CODE = 9999999;

    public Address(String city, String street, String houseNumber, int postalCode, String country)
    {
        this(city, street, houseNumber, null, postalCode, country);
    }

    public boolean hasApartment()
    {
        return apartmentNumber() != null;
    }

    public static boolean isValidPostalCode(int postalCode)
    {
        return postalCode >= MIN_POSTAL_CODE && postalCode <= MAX_POSTAL_CODE;
    }

    public boolean isInIsrael()
    {
        return country.equals("Israel");
    }

    public String getFullAddress()
    {
        return city() + ", " + street() + " " + houseNumber() +
                (hasApartment() ? ", Apt " + apartmentNumber() : "") + ", " + postalCode() + ", " + country();
    }

}