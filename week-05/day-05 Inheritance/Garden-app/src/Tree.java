public class Tree extends Plant{

    public Tree() {
        super();
        lessAmount = 10;
        absorbRate = 0.4;
    }

    public Tree(String color) {
        this();
        this.color = color;
    }


}
