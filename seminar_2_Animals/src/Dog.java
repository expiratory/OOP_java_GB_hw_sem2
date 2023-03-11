public class Dog extends Animal implements Eating, Speaking{

    public Dog(String name, int age, Gender gender, String color) {
        super(name, age, gender, color);
    }

    @Override
    public void answerToCall(Person person) {
        if (super.getIsCalled() == true) {
            System.out.println("Песик " + super.getName() + " отзывается на зов человека " + person.getName() + " и говорит гав");
        } else {
            System.out.println("Песика " + super.getName() + " никто не звал :(");
        }
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
