package chapter02inheritance.example03polymorphism;

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}
