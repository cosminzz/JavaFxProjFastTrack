package sample.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button welcomeExitButton;

    @FXML
    private Button welcomeRegisterButton;

    @FXML
    private Button welcomeViewButton;

    @FXML
    void initialize() {
        welcomeRegisterButton.setOnAction((e -> {
            try {
                registerScreenButtonPush(e);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }));

        welcomeViewButton.setOnAction((e -> {
            System.out.println("Butonul view a fost apasat");
        }));

        welcomeExitButton.setOnAction((e -> {
            System.out.println("Butonul exit a fost apasat");
            Platform.exit();
        }));
    }

    public void registerScreenButtonPush(ActionEvent event) throws IOException {
        Parent registerParent = FXMLLoader.load(getClass().getResource("../view/register.fxml"));
        Scene registerScene = new Scene(registerParent, 700, 450);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(registerScene);
        window.show();
    }
}
