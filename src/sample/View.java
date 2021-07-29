package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View extends Application {//therhsfhrdthrtshmtjgiotghijghbkjrghbkjdrgbhk

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//--module-path "C:\Users\yinon\הנדסת תוכנה קבצים - לפטופ\javafx-sdk-16\lib" --add-modules javafx.controls,javafx.fxml