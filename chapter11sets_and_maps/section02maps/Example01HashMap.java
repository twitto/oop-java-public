package chapter11sets_and_maps.section02maps;


import java.util.HashMap;
import java.util.Map;

public class Example01HashMap
{
    public static void main(String[] args)
    {
        Map<String, String> employees = new HashMap<>();
        employees.put("101", "Yossi Cohen, Engineer");
        employees.put("102", "Hassan Ali, Manager");
        employees.put("103", "Shir Levi, Programmer");
        employees.put("104", "Abebe Alemu, Designer");
        employees.put("105", "Irina Smirnova, Developer");
        employees.put("106", "Noura Khalil, Analyst");

        System.out.println(employees.get("102")); // Hassan Ali, Manager
        System.out.println(employees.containsKey("101")); // true
        System.out.println(employees.containsValue("Shir Levi, Programmer")); // true

        // Remove a key-value pair from the map
        employees.remove("103");

        // Iterate over the map's keys and values
        for (Map.Entry<String, String> entry : employees.entrySet()) {
            String id = entry.getKey();
            String record = entry.getValue();
            System.out.println("ID: " + id + ", record: " + record);
        }
        //ID: 101, record: Yossi Cohen, Engineer
        //ID: 102, record: Hassan Ali, Manager
        //ID: 104, record: Abebe Alemu, Designer
        //ID: 105, record: Irina Smirnova, Developer
        //ID: 106, record: Noura Khalil, Analyst
    }
}

