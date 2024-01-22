package exams.oop23c_scecs.moedb.q2_zoo_package;

public class Wolf extends CarnivoreMammal {
    public Wolf(int id, String name, double weight, double age) {
        super(id, name, weight, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}


