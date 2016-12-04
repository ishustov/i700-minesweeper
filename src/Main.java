/**
 * Created by el on 29/11/2016.
 */

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Main extends Application {
    Scene scene1, scene2;
    private Sound sound;
    public void init(){
        Sound.music();
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Button 1
        Label label1 = new Label("Welcome to Minesweeper game! This game was made by Ilja Shustov");
        Button button1 = new Button("Start the game");
        button1.setOnAction(e -> stage.setScene(scene2));

        //Layout 1
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 400, 400);

        //Layout 2
        StackPane layout2 = new StackPane();
        scene2 = new Scene(layout2, 600, 300);

        //Display scene 1 at first
        stage.setScene(scene1);
        stage.setTitle("Title Here");
        stage.show();

        stage.setScene(scene1);
        stage.setTitle("i700");
        stage.show();
    }
}
