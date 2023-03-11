public class Cat extends Animal implements Eating, Speaking{

    public Cat(String name, int age, Gender gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public void eat() {
        System.out.println("Котик " + super.getName() + " кушает");
    }

    @Override
    public void speak() {
        System.out.println("Котик " + super.getName() + " мяукает");
    }
}
