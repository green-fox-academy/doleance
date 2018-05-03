public class Test {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2 = new Counter(5);

        System.out.println(count1.get());
        System.out.println(count2.get());

        count1.add();
        count2.add(5);

        System.out.println(count1.get());
        System.out.println(count2.get());

        count2.reset();

        System.out.println(count2.get());
    }
}
