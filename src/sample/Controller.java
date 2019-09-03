package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Controller {
    public void handleButtonActionNewProject(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NewProject.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Neues Projekt");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
