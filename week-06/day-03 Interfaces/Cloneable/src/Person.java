public class Person {

    protected String name;
    protected int age;
    protected String gender;

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s.%n", name, age, gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public Person(String name, int age, String gender) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
