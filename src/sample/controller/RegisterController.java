package sample.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField registerVarstaTField;

    @FXML
    private Button registerViewButton;

    @FXML
    private Button registerRegisterButton;

    @FXML
    private ChoiceBox<String> registerMateriaCBox;

    @FXML
    private Button registerExitButton;

    @FXML
    private TextField registerPrenumeTField;

    @FXML
    private TextField registerNumeTField;

    @FXML
    void initialize() {
        registerRegisterButton.setOnAction((event -> {
            System.out.println(registerRegisterButton.getText() + " was pressed");
        }));
        registerViewButton.setOnAction((event -> {
            System.out.println(registerViewButton.getText() + " was pressed");
        }));
        registerExitButton.setOnAction((event -> {
            System.out.println(registerExitButton.getText() + " was pressed");
        }));
    }
}
