public class Shifter implements CharSequence {

    private String string;
    private int howManySpaces;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getHowManySpaces() {
        return howManySpaces;
    }

    public void setHowManySpaces(int howManySpaces) {
        this.howManySpaces = howManySpaces;
    }

    public Shifter(String string, int howManySpaces) {
        this.string = string;
        this.howManySpaces = howManySpaces;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        try {
            return string.charAt(index + howManySpaces);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("I can't shift that far.");
            return '\0';
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        try {
            return string.subSequence(start + howManySpaces, end + howManySpaces);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("I can't shift that far.");
            return "";
        }
    }

    public static void main(String[] args) {
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
        System.out.println(s.subSequence(0,7));
    }
}
