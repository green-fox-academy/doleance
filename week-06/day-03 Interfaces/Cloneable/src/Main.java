public class Main {
    public static void main(String[] args) {
        Student johhnyBoy = new Student("John", 22, "male", "BME");
        Student jackTwin = new Student();
        try {
            jackTwin = (Student)johhnyBoy.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Sorry, he can't have a twin brother.");
        }

        johhnyBoy.introduce();
        jackTwin.introduce();
    }
}
