package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class View extends Application {

    Button button;

    public void start(Stage primaryStage) throws Exception {
        GraphicalUI gui = new GraphicalUI();
        primaryStage.setTitle("Company");
        GridPane gridPane= new GridPane();
        GridPane gridPane1= new GridPane();
        Scene scene = new Scene(gridPane,500,500);
        Scene scene1 = new Scene(gridPane1,300,300);
        Button b = new Button("hi");
        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                gui.showMessege("ma kore ya hamod");
            }
        });
        gridPane.getChildren().add(b);
        Button b2 = new Button("<- back");
        gridPane1.getChildren().add(b2);
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(scene);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}