public abstract class Animal{
    private String name;
    private int age;
    private GenderForAnimals genderForAnimals;

    public Animal(String name, int age, GenderForAnimals genderForAnimals) {
        this.name = name;
        this.age = age;
        this.genderForAnimals = genderForAnimals;
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

    public GenderForAnimals getGender() {
        return genderForAnimals;
    }

    public void setGender(GenderForAnimals genderForAnimals) {
        this.genderForAnimals = genderForAnimals;
    }

    @Override
    public String toString() {
        if (this.genderForAnimals == GenderForAnimals.male) {
            return name + " " + age + " " + "самец";
        } else {
            return name + " " + age + " " + "самка";
        }
    }
}
