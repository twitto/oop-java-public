package chapter11sets_and_maps.section02maps;


import java.util.HashMap;
import java.util.Map;

public class Example02HashMap
{
    public static void main(String[] args)
    {
        Map<String, String> countryPopulation = new HashMap<>();
        countryPopulation.put("China", "1.4 billion");
        countryPopulation.put("India", "1.3 billion");
        countryPopulation.put("United States", "331 million");
        System.out.println(countryPopulation);

        countryPopulation.replace("India", "1.4 billion");
        System.out.println(countryPopulation);

        countryPopulation.putIfAbsent("Indonesia", "271 million");
        countryPopulation.putIfAbsent("India", "1.3 billion");
        System.out.println(countryPopulation);

        for (String country : countryPopulation.keySet()) {
            String population = countryPopulation.get(country);
            System.out.println(country + " population: " + population + " people");
        }
    }
    //{United States=331 million, China=1.4 billion, India=1.3 billion}
    //{United States=331 million, China=1.4 billion, India=1.4 billion}
    //{United States=331 million, China=1.4 billion, India=1.4 billion, Indonesia=271 million}
    //United States population: 331 million people
    //China population: 1.4 billion people
    //India population: 1.4 billion people
    //Indonesia population: 271 million people
}

