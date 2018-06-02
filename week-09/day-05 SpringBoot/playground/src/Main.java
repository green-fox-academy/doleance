public class Main {
    public static void main(String[] args) {
        Greeting hey = new Greeting("name");
        System.out.println(hey.getId() + " " + hey.getContent());
        Greeting hey2 = new Greeting("name2");
        System.out.println(hey2.getId() + " " + hey2.getContent());
    }
}
