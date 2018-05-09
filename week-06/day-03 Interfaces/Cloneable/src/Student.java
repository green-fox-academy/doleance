public class Student extends Person implements Cloneable {

    protected String previousOrganization;
    protected int skippedDays;

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public void setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s from %s " +
                "who skipped %d days from the course already.%n",
                name, age, gender, previousOrganization, skippedDays);
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        setPreviousOrganization(previousOrganization);
        skippedDays = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
