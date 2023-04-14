package chapter04interfaces.example02extending_interfaces;

public class Button implements Drawable
{
    private String label;

    public Button(String label)
    {
        this.label = label;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing button with label: " + label);
    }
}
