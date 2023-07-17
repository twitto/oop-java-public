package chapter01classes.car;

/**
 * Represents a car with model, ID, and color.
 */
public class Car
{
    private String model;
    private int id;
    private String color;

    /**
     * Constructs a car object with default values.
     */
    public Car()
    {
        this("Unknown", 0, "Unknown");
    }

    /**
     * Constructs a car object with the given model, ID, and color.
     *
     * @param model The model of the car.
     * @param id    The ID of the car.
     * @param color The color of the car.
     */
    public Car(String model, int id, String color)
    {
        this.model = model;
        this.id = id;
        this.color = color;
    }

    /**
     * Constructs a car object with the given model and ID, and assigns a default color.
     *
     * @param model The model of the car.
     * @param id    The ID of the car.
     */
    public Car(String model, int id)
    {
        this(model, id, "Unknown");
    }

    /**
     * Returns the model of the car.
     *
     * @return The model of the car.
     */
    public String getModel()
    {
        return model;
    }

    /**
     * Returns the ID of the car.
     *
     * @return The ID of the car.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns the color of the car.
     *
     * @return The color of the car.
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Sets the model of the car.
     *
     * @param model The model of the car.
     */
    public void setModel(String model)
    {
        this.model = model;
    }

    /**
     * Sets the ID of the car.
     *
     * @param id The ID of the car.
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Sets the color of the car.
     *
     * @param color The color of the car.
     */
    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * Returns a string representation of the car.
     *
     * @return A string representation of the car.
     */
    @Override
    public String toString()
    {
        return "Car{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && model.equals(car.model) && color.equals(car.color);
    }
}

