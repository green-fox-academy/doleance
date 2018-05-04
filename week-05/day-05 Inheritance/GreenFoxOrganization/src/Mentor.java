public class Mentor extends Person {

    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s %s mentor.%n",
                name, age, gender, level);
    }

    public Mentor() {
        super();
        setLevel("intermediate");
    }

    public Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

}
