public class Main {
    public static void main(String[] args) {

        int[] myBgColor = {255, 128, 0};
        int[] myTxtColor = {0, 204, 204};
        PostIt firstPost = new PostIt(myBgColor, myTxtColor, "Idea 1");

        myBgColor = new int[] {255, 102, 102};
        myTxtColor = new int[] {0, 0, 0};
        PostIt secondPost = new PostIt(myBgColor, myTxtColor, "Awesome1");

        myBgColor = new int[] {255, 255, 0};
        myTxtColor = new int[] {76, 153, 0};
        PostIt thirdPost = new PostIt(myBgColor, myTxtColor, "Superb!");

        

    }
}
