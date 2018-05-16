public class Main {
    public static void main(String[] args) {
        Student johnnyBoy = new Student("John", 22, "male", "BME");
        Student jackTwin = new Student();
        try {
            jackTwin = (Student)johnnyBoy.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Sorry, he can't have a twin brother.");
        }

        johnnyBoy.introduce();
        jackTwin.introduce();
    }
}
