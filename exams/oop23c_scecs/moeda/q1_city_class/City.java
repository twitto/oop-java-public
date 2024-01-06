package exams.oop23c_scecs.moeda.q1_city_class;

import java.util.Objects;

public class City {
    private String name;
    private int population;
    private String country;
    private boolean isCapital;

    public City(String name, int population, String country, boolean isCapital) {
        if (name == null || name.isEmpty() || population <= 0 || country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        this.name = name;
        this.population = population;
        this.country = country;
        this.isCapital = isCapital;
    }

    @Override
    public String toString()
    {
        return "City{" +
                "name=" + name +
                ", population=" + population +
                ", country=" + country +
                ", isCapital=" + isCapital +
                "}";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        City city = (City) o;

        return population == city.population
                && isCapital == city.isCapital
                && Objects.equals(name, city.name)
                && Objects.equals(country, city.country);
    }

    public void updatePopulation(int populationChange) {
        if (population + populationChange <= 0) {
            throw new IllegalArgumentException("Population must be a positive integer");
        }
        this.population += populationChange;
    }

    public void updateCityName(String newCityName) {
        if (newCityName == null || newCityName.isEmpty()) {
            throw new IllegalArgumentException("City name cannot be empty");
        }
        this.name = newCityName;
    }
}

