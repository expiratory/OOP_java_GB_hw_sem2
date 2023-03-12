public class Person implements Comparable{
    private String name;
    private Gender gender;
    private int age;

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (this.gender == Gender.male) {
            return this.name + " мужчина " + this.age;
        } else {
            return this.name + " женщина " + this.age;
        }
    }

    @Override
    public int compareTo(Object o) {
        return this.getAge() - (((Person) o).getAge());
    }
}