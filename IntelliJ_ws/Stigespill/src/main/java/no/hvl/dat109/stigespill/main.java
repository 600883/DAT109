package no.hvl.dat109.stigespill;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {

    public static final int Tile_size = 80;

    public static final int width = 10;

    public static final int height = 10;


    private
    private parent createContent() {



        StackPane root = new StackPane();
        root.setPrefSize(width * Tile_size, (height * Tile_size) + 80);
        return root;
    }


    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(createContent());
        stage.setTitle("Spill Stigespillet");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}