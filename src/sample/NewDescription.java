package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NewDescription {
    public void handleButtonActionNext(ActionEvent actionEvent) {
        BorderPane root = new BorderPane();
        Parent p = null;
        try {
            p = FXMLLoader.load(getClass().getResource("NewDate.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Neues Projekt");
        primaryStage.setScene(new Scene(p));
        primaryStage.show();
    }
}
