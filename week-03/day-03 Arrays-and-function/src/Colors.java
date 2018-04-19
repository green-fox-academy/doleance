// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
public class Colors {
    public static void main(String[] args) {
        String[][] rainbow = new String[5][5];
        String[] aColor = {"orange", "tomato", "dark", "turkey", "scarlet"};
        matrixFill(rainbow,aColor,0);
        changeAllElements(aColor,"orchid", "violet", "pink", "hot", "punch");
        matrixFill(rainbow,aColor,1);
        changeAllElements(aColor,"cyan", "sky", "azure", "royal", "navy");
        matrixFill(rainbow,aColor,2);
        changeAllElements(aColor,"emerald", "mint", "basil", "seaweed", "lime");
        matrixFill(rainbow,aColor,3);
        changeAllElements(aColor,"canary", "gold", "dijon", "banana", "lemon");
        matrixFill(rainbow,aColor,4);
        multiArrayPrint(rainbow);

    }

    private static void changeAllElements(String[] array, String... elements) {
        for (int i = 0; i < array.length; i++) {
            array[i] = elements[i];
        }
    }

    private static void multiArrayPrint(String[][] array) {
        for (String[] rows : array) {
            for (String elements : rows) {
                System.out.print(String.format("%10s", elements));
            }
            System.out.println();
        }
    }

    private static void matrixFill(String[][] matrix, String[] array, int whichRow) {
        for (int i = 0; i < 5; i++) {
            matrix[whichRow][i] = array[i];
        }
    }

}
