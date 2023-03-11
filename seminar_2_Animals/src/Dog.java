public class Dog extends Animal implements Eating, Speaking{

    public Dog(String name, int age, Gender gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public void eat() {
        System.out.println("Песик " + super.getName() + " кушает");
    }

    @Override
    public void speak() {
        System.out.println("Песик " + super.getName() + " гавкает");
    }
}
