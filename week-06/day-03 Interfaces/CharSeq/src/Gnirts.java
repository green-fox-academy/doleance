public class Gnirts implements CharSequence {

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Gnirts(String what) {
        string = what;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return string.charAt(string.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return string.subSequence(string.length() - end, string.length() - start);
    }

    public static void main(String[] args) {
        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
        System.out.println(g.subSequence(0,g.length()));
    }

}
