public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Цири", 2, Gender.female, "серый, полосатый");
        Cat cat2 = new Cat("Пушок", 19, Gender.male, "серый, полосатый");
        Dog dog1 = new Dog("Гера", 10, Gender.female, "черно-коричневый");
        Dog dog2 = new Dog("Бобик", 5, Gender.male, "белый с черным ухом");

        Person sveta = new Person("Света", 25, Gender.female);
        Person petya = new Person("Петя", 33, Gender.male);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(sveta);
        System.out.println(petya);
    }
}
