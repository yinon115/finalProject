package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class View extends Application {


    public void start(Stage primaryStage) throws Exception {
        GraphicalUI gui = new GraphicalUI();
        primaryStage.setTitle("Company");
        VBox menuB = new VBox();
        GridPane g1 = new GridPane();
        GridPane g2 = new GridPane();
        GridPane g3 = new GridPane();
        GridPane g4 = new GridPane();
        GridPane g5 = new GridPane();
        Scene menu =  new Scene(menuB,350,350);
        Scene addworker =  new Scene(g1,350,350);
        Scene showWorker =  new Scene(g2,350,350);
        Scene changeRole =  new Scene(g3,350,350);
        Scene changeDep =  new Scene(g4,350,350);
        Scene profit =  new Scene(g5,350,350);


        //................................Menu.......................................//
        menuB.setSpacing(5);
        menuB.setPadding(new Insets(10));
        menuB.setAlignment(Pos.CENTER);
        Button Baddworker =  new Button("Add worker");
        Baddworker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(addworker);
            }
        });
        Button BshowWorker = new Button("Show All Workers");
        BshowWorker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(showWorker);
            }
        });
        Button Bchangerole = new Button("Change Preference On Role");
        Bchangerole.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(changeRole);
            }
        });
        Button Bchangedep = new Button("Change Preference On Department");
        Bchangedep.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(changeDep);
            }
        });
        Button Bprofit = new Button("Show Profit/Losses");
        Bprofit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(profit);
            }
        });
        Baddworker.setPrefWidth(350);
        BshowWorker.setPrefWidth(350);
        Bchangedep.setPrefWidth(350);
        Bchangerole.setPrefWidth(350);
        Bprofit.setPrefWidth(350);
        menuB.getChildren().add(Baddworker);
        menuB.getChildren().add(BshowWorker);
        menuB.getChildren().add(Bchangerole);
        menuB.getChildren().add(Bchangedep);
        menuB.getChildren().add(Bprofit);
        //.................................................................................//

        //.......................Add Worker..................................//
        Label headline = new Label("Add worker");
        headline.setAlignment(Pos.CENTER);
        Label lblname = new Label("Enter Full Name");
        Label lbldate = new Label("");




        primaryStage.setScene(menu);
        primaryStage.show();
    }
//

    public static void main(String[] args) {
        launch(args);
    }

}