package mr;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Warcaby extends Application {

    private Image imageback = new Image("file:resources/szachownica-1200.png");
    private Image pieceBlack = new Image("file:resources/pieceBlackMini.png");
    private Image pieceWhite = new Image("file:resources/pieceWhiteMini.png");
    private FlowPane pieces = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(pieceBlack);
        pieces.getChildren().add(img);

        grid.add(pieces, 0, 0, 3, 1);

        Scene scene = new Scene(grid, 940, 600, Color.BLACK);

        primaryStage.setTitle("Warcaby");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
