package mr;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {
    private Piece piece;

    public boolean hasPiece() {
        return piece != null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Tile(boolean light, int x, int y) {
        setWidth(CheckersApplication.TILE_SIZE);
        setHeight(CheckersApplication.TILE_SIZE);

        relocate(x * CheckersApplication.TILE_SIZE, y * CheckersApplication.TILE_SIZE);

        setFill(light ? Color.valueOf("#f7f5f5") : Color.valueOf("#3b3b3b"));
    }

}
