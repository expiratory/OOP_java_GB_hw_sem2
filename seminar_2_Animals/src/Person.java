import java.util.Random;
public class Person implements Eating, Speaking{
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        if (this.gender == Gender.male) {
            return name + " " + age + " " + "мужчина";
        } else {
            return name + " " + age + " " + "женщина";
        }
    }

    @Override
    public void eat() {
        Random random = new Random();
        int rnd = random.nextInt(3);
        if (rnd == 0) {
            System.out.println(this.name + " завтракает");
        } else if (rnd == 1) {
            System.out.println(this.name + " обедает");
        } else if (rnd == 2) {
            System.out.println(this.name + " ужинает");
        }
    }

    @Override
    public void speak() {
        Random random = new Random();
        int rnd = random.nextInt(3);
        if (rnd == 0) {
            System.out.println(this.name + " рассказывает анекдот");
        } else if (rnd == 1) {
            System.out.println(this.name + " рассказывает как прошел день");
        } else if (rnd == 2) {
            System.out.println(this.name + " рассказывает поучительную историю");
        }
    }

    public void petAnimal(Animal animal) {
        animal.setHappiness(animal.getHappiness() + 1);
        Random random = new Random();
        int rnd = random.nextInt(3);
        if (rnd == 0) {
            System.out.println(this.name + " погладил " + animal.getName());
            animal.happinessLevel();
        } else if (rnd == 1) {
            System.out.println(this.name + " дал вкусняшку " + animal.getName());
            animal.happinessLevel();
        } else if (rnd == 2) {
            System.out.println(this.name + " почесал за ушком " + animal.getName());
            animal.happinessLevel();
        }
    }

    public void callAnimal(Animal animal) {
        animal.setIsCalled(true);
        System.out.println(this.name + " позвал " + animal.getName());
    }
}
