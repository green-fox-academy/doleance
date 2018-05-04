import java.util.*;

public class Cohort {

    private String name;
    private List<Student> students = new ArrayList<Student>();
    private List<Mentor> mentors = new ArrayList<Mentor>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }

    Cohort(String name) {
        students.clear();
        mentors.clear();
        setName(name);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.printf("The %s cohort has %d students and %d mentors.%n",
                name, students.size(), mentors.size());
    }

}

