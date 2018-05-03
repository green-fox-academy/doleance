public class Main {

    public static void main(String[] args) {
        Sharpie pen = new Sharpie("black", 2.3f);
        pen.use();
        System.out.println(pen.inkAmount);

    }

}
