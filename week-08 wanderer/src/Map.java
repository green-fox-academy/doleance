import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Map {

    public int[][] boardMatrix = new int[GameProperties.BOARD_SIZE][GameProperties.BOARD_SIZE];
    String mapFile = "maps/map0" + GameProperties.level + ".txt";

    public Map(Graphics graphics) {
        boardSetUp(mapFile);
        boardDraw(graphics);
    }

    public void boardSetUp(String mapFile) {
        Path mapPath = Paths.get(mapFile);
        List<String> fileContent = new ArrayList<String>();
        try {
            fileContent = Files.readAllLines(mapPath);
        } catch (IOException e) {
            System.out.println("This map isn't a map. I can't read.");
        }
        for (int i = 0; i < GameProperties.BOARD_SIZE; i++) {
            for (int j = 0; j < GameProperties.BOARD_SIZE; j++) {
                boardMatrix[i][j] = (int)fileContent.get(i).charAt(j) - 48;
            }
        }
    }

    public void boardDraw(Graphics graphics) {
        for (int i = 0; i < GameProperties.BOARD_SIZE; i++) {
            for (int j = 0; j < GameProperties.BOARD_SIZE; j++) {
                if (boardMatrix[i][j] == 1) {
                    PositionedImage imgFloor = new PositionedImage(
                            "wanderer-java/img/floor.png", i * 72, j * 72);
                    imgFloor.draw(graphics);
                } else {
                    PositionedImage imgWall = new PositionedImage(
                            "wanderer-java/img/wall.png", i * 72, j * 72);
                    imgWall.draw(graphics);
                }
            }
            System.out.println();
        }
    }
}
