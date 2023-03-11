public abstract class Animal{
    private String name;
    private int age;
    private Gender gender;

    private String color;

    private int happiness = 0;

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

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    @Override
    public String toString() {
        if (this.gender == Gender.male) {
            return name + " " + age + " " + "самец" + " " + color;
        } else {
            return name + " " + age + " " + "самка" + " " + color;
        }
    }

    public void happinessLevel() {
        if (this.happiness == 0) {
            System.out.println(this.name + " чувствует себя грустно");
        } else if (this.happiness == 1) {
            System.out.println(this.name + " чувствует себя нормально");
        } else if (this.happiness >= 2) {
            System.out.println(this.name + " чувствует себя счастливо");
        }
    }
}
