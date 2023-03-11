public abstract class Animal{
    private String name;
    private int age;
    private Gender gender;

    private String color;

    public Animal(String name, int age, Gender gender, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.gender == Gender.male) {
            return name + " " + age + " " + "самец" + " " + color;
        } else {
            return name + " " + age + " " + "самка" + " " + color;
        }
    }
}
