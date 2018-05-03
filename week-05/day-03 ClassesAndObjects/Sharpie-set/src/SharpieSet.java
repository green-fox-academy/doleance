import java.util.ArrayList;

public class SharpieSet {

    ArrayList<Sharpie> mySharpies = new ArrayList();

    public int countUsable() {
        int howManyGoodSharpie = 0;
        for (int i = 0; i < mySharpies.size(); i++) {
            if (mySharpies.get(i).inkAmount > 0) {
                howManyGoodSharpie++;
            }
        }
        return howManyGoodSharpie;
    }

    public void removeTrash() {
        for (int i = 0; i < mySharpies.size(); i++) {
            if (mySharpies.get(i).inkAmount == 0) {
                mySharpies.remove(i);
            }
        }
    }
}
