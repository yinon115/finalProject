package View;
import Controller.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class View extends Application {


    public void start(Stage primaryStage) throws Exception {
        Controller controller = new Controller();
        GraphicalUI gui = new GraphicalUI();
        primaryStage.setTitle("Company");
        VBox menuB = new VBox();
        GridPane g1 = new GridPane();
        GridPane g2 = new GridPane();
        GridPane g3 = new GridPane();
        GridPane g4 = new GridPane();
        GridPane g5 = new GridPane();
        GridPane g6 = new GridPane();
        GridPane g7 = new GridPane();
        Scene menu =  new Scene(menuB,350,350);
        Scene addworker =  new Scene(g1,380,350);
        Scene showWorker =  new Scene(g2,380,350);
        Scene changeRole =  new Scene(g3,380,350);
        Scene changeDep =  new Scene(g4,380,350);
        Scene profit =  new Scene(g5,380,350);
        Scene addDep =  new Scene(g6,380,350);
        Scene addRole =  new Scene(g7,380,350);
        primaryStage.setScene(menu);
        primaryStage.show();

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
        Button Baddrole =  new Button("Add role");
        Baddrole.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(addRole);
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
        Button BaddDep = new Button("Add Department");
        BaddDep.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(addDep);
            }
        });
        Baddworker.setPrefWidth(350);
        BshowWorker.setPrefWidth(350);
        Bchangedep.setPrefWidth(350);
        Bchangerole.setPrefWidth(350);
        Bprofit.setPrefWidth(350);
        BaddDep.setPrefWidth(350);
        Bprofit.setPrefWidth(350);
        Baddrole.setPrefWidth(350);
        menuB.getChildren().add(Baddworker);
        menuB.getChildren().add(BaddDep);
        menuB.getChildren().add(Baddrole);
        menuB.getChildren().add(BshowWorker);
        menuB.getChildren().add(Bchangerole);
        menuB.getChildren().add(Bchangedep);
        menuB.getChildren().add(Bprofit);
        //.................................................................................//


        //.......................Add Worker..................................//
        Label headline = new Label("Add Worker");
        headline.setAlignment(Pos.CENTER);
        Label lblname = new Label("Full Name:");
        Label lbldate = new Label("Birthday:");
        Label lbldepartment = new Label("Department:");
        Label  lblrole = new Label("Role:");
        Label  lblpref = new Label("Preference:");
        Label  lblsalary = new Label("Salary");
        TextField txtname= new TextField();
        TextField txtdate = new TextField();
        ComboBox<String> txtdepartment = new ComboBox<String>();
        ComboBox<String> txtrole = new ComboBox<String>();
        ComboBox<String> txtpref = new ComboBox<String>();
        TextField txtsalary = new TextField();
        Button cancel = new Button("Cancel");
        Button submit = new Button("Submit");
        g1.setPadding(new Insets(10));
        g1.setHgap(10);
        g1.setVgap(10);
        g1.add(headline,0,0);
        g1.add(lblname,0,1);
        g1.add(txtname,1,1);
        g1.add(lbldate,0,2);
        g1.add(txtdate,1,2);
        g1.add(lbldepartment,0,3);
        g1.add(txtdepartment,1,3);
        g1.add(lblrole,0,4);
        g1.add(txtrole,1,4);
        g1.add(lblpref,0,5);
        g1.add(txtpref,1,5);
        g1.add(lblsalary,0,6);
        g1.add(txtsalary,1,6);
        g1.add(cancel,2,14);
        g1.add(submit,3,14);
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(menu);
            }
        });
        //..................................................................//

        //.......................Add Role..................................//
        Label roleHeadline = new Label("Add Role");
        roleHeadline.setAlignment(Pos.CENTER);
        Label lblRoleName = new Label("Role's name:");
        TextField txtRoleName= new TextField();
        Button cancel2 = new Button("Cancel");
        Button submit2 = new Button("Submit");
        g7.setPadding(new Insets(10));
        g7.setHgap(10);
        g7.setVgap(10);
        g7.add(roleHeadline,0,0);
        g7.add(lblRoleName,0,1);
        g7.add(txtRoleName,1,1);
        g7.add(cancel2,2,14);
        g7.add(submit2,3,14);
        cancel2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(menu);
            }
        });
        //..................................................................//


        //.......................Add Department..................................//
        Label headline1 = new Label("Add Departemrnt");
        headline1.setAlignment(Pos.CENTER);
        Label lblnamedep = new Label("Name of department:");
        Label  lblchoseroles = new Label("Role:");
        Label  lblstarttime = new Label("Start time");
        Label  lbldepsalary = new Label("Salary");
        Label  home = new Label("home");
        TextField txtdepname= new TextField();
        TextField txtstarttime= new TextField();
        TextField txtdepsalary = new TextField();
        Button cancel1 = new Button("Cancel");
        Button submit1 = new Button("Submit");
        g6.setPadding(new Insets(10));
        g6.setHgap(10);
        g6.setVgap(10);
        g6.add(headline1,0,0);
        g6.add(lblnamedep,0,1);
        g6.add(txtdepname,1,1);
        g6.add(lblchoseroles,0,2);
//        g1.add(txtdate,1,2);
        g6.add(lblstarttime,0,3);
        g6.add(txtstarttime,1,3);
        g6.add(lbldepsalary,0,4);
        g6.add(txtdepsalary,1,4);
//        g1.add(lblpref,0,5);
//        g1.add(txtpref,1,5);
//        g1.add(lblsalary,0,6);
//        g1.add(txtsalary,1,6);
        g6.add(cancel1,2,14);
        g6.add(submit1,3,14);
        cancel1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(menu);
            }
        });
        //..................................................................//

        //.......................Change Preference On Role..................................//
        Label prefHeadline = new Label("Please choose the new prefrence:");
        prefHeadline.setAlignment(Pos.CENTER);
        ToggleGroup tglPrefMenu = new ToggleGroup();
        g3.getChildren().add(prefHeadline);
        prefHeadline.setAlignment(Pos.TOP_CENTER);
        g3.setPadding(new Insets(10));
        g3.setAlignment(Pos.CENTER_LEFT);
        g3.setVgap(10);
        g3.setHgap(15);

        RadioButton rbEarly = new RadioButton("Start early");
        RadioButton rbLate = new RadioButton("Start late");
        RadioButton rbSame = new RadioButton("Stay in the same hours");
        RadioButton rbHome = new RadioButton("Work from home");

        rbEarly.setToggleGroup(tglPrefMenu);
        rbLate.setToggleGroup(tglPrefMenu);
        rbSame.setToggleGroup(tglPrefMenu);
        rbHome.setToggleGroup(tglPrefMenu);

        Button btnkSubmit = new Button("Submit");
        ComboBox<String> c3role = new ComboBox<String>();
        Label lblYourDetails = new Label();
        lblYourDetails.setWrapText(true);
        g3.add(new Label("Role:"),0,2,2,1);
        g3.add(c3role,2,2,2,1);
        g3.add(rbEarly, 0, 3, 2, 1);
        g3.add(rbLate, 0, 4, 2, 1);
        g3.add(rbSame, 0, 5, 2, 1);
        g3.add(rbHome, 0, 6, 2, 1);
        g3.add(btnkSubmit,0,9,2,1);
        Button c1=  new Button("Cancel");
        c1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(menu);
            }
        });
        g3.add(c1,0,10,2,1);
        /* btnShowDetails */
        btnkSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (!rbEarly.isSelected() && !rbLate.isSelected() && !rbSame.isSelected() && !rbHome.isSelected()) {
                    lblYourDetails.setTextFill(Color.RED);
                    lblYourDetails.setText("You must select an option!");
                }

            }

        });
        g3.setVgap(10);
        // gpCenterStation.getChildren().addAll(rbRegular, rbCorona, rbMilitary,
        // rbMilitaryCorona);
//        bpRoot.setCenter(gpCenterPrefrence);
        g3.setAlignment(Pos.TOP_CENTER);
        //......................................................................................//

        //...........................Change Preference On Department............................//
        Label depHeadline = new Label("Please choose the new department:");
        depHeadline.setAlignment(Pos.CENTER);
        ToggleGroup tglDepMenu = new ToggleGroup();
        ComboBox<String> c4dep = new ComboBox<String>();
        g4.getChildren().add(prefHeadline);
        prefHeadline.setAlignment(Pos.TOP_CENTER);
        g4.setPadding(new Insets(10));
        g4.setAlignment(Pos.CENTER_LEFT);
        g4.setVgap(10);
        g4.setHgap(15);

        RadioButton rb1Early = new RadioButton("Start early");
        RadioButton rb1Late = new RadioButton("Start late");
        RadioButton rb1Same = new RadioButton("Stay in the same hours");
        RadioButton rb1Home = new RadioButton("Work from home");

        rb1Early.setToggleGroup(tglDepMenu);
        rb1Late.setToggleGroup(tglDepMenu);
        rb1Same.setToggleGroup(tglDepMenu);
        rb1Home.setToggleGroup(tglDepMenu);

        Button btnkSubmit1 = new Button("Submit");

        Label lblYourDetails1 = new Label();
        lblYourDetails.setWrapText(true);
        g4.add(new Label("Department:"),0,2,2,1);
        g4.add(c4dep,2,2,2,1);
        g4.add(rb1Early, 0, 3, 2, 1);
        g4.add(rb1Late, 0, 4, 2, 1);
        g4.add(rb1Same, 0, 5, 2, 1);
        g4.add(rb1Home, 0, 6, 2, 1);
        g4.add(btnkSubmit1, 0, 9, 2, 1);
        g4.add(lblYourDetails1,0,10,2,1);
        Button c2=  new Button("Cancel");
        c2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.setScene(menu);

            }
        });
        g4.add(c2,0,10,2,1);
        /* btnShowDetails */
        btnkSubmit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                if (!rbEarly.isSelected() && !rbLate.isSelected() && !rbSame.isSelected() && !rbHome.isSelected()) {
                    lblYourDetails.setTextFill(Color.RED);
                    lblYourDetails.setText("You must select an option!");
                }

            }

        });
        g4.setVgap(10);
        g4.setAlignment(Pos.TOP_CENTER);
        //......................................................................................//
    }
//

    public static void main(String[] args) {
        launch(args);
    }

}