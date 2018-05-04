public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public void setHiredStudents(int hiredStudents) {
        this.hiredStudents = hiredStudents;
    }

    public void introduce () {
        System.out.printf("Hi, I'm %s, a %d year old %s who represents %s" +
                "and hired %d students so far.%n", name, age, gender, company, hiredStudents);
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public Sponsor() {
        super();
        setHiredStudents(0);
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        setCompany(company);
    }

}
