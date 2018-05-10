import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their
        // adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);

        List<Domino> sortedDominoes = dominoes;
        for (int i = 1; i < sortedDominoes.size() - 1; i++) {
            if (sortedDominoes.get(i - 1).getValues()[1] != sortedDominoes.get(i).getValues()[0]) {
                int j = i + 1;
                while ((sortedDominoes.get(i - 1).getValues()[1] != sortedDominoes.get(j).getValues()[0]) && (j < sortedDominoes.size() - 2)) {
                    j++;
                }
                switchElements(sortedDominoes, i, j);
            }
        }

        System.out.println(sortedDominoes);

    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    public static void switchElements(List<Domino> list, int index1, int index2) {
        Domino tempElement = list.get(index1);
        list.remove(index1);
        list.add(index1, list.get(index2 - 1));
        list.remove(index2);
        list.add(index2, tempElement);
    }
}