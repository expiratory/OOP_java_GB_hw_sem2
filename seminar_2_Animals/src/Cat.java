public class Cat extends Animal implements Eating, Speaking, Comparable{

    public Cat(String name, int age, Gender gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public void answerToCall(Person person) {
        if (super.getIsCalled() == true) {
            System.out.println("Котик " + super.getName() + " отзывается на зов человека " + person.getName() + " и говорит мяу");
        } else {
            System.out.println("Котика " + super.getName() + " никто не звал :(");
        }
    }

    @Override
    public void eat() {
        System.out.println("Котик " + super.getName() + " кушает");
    }

    @Override
    public void speak() {
        System.out.println("Котик " + super.getName() + " мяукает");
    }

    @Override
    public int compareTo(Object o) {
        return super.getAge() - (((Cat) o).getAge());
    }
}
