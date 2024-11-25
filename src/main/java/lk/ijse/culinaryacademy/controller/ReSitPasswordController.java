package lk.ijse.culinaryacademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReSitPasswordController {
    @FXML
    private Button btnRstPassword;

    @FXML
    private Hyperlink linkSignUp;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblErrors;

    @FXML
    private AnchorPane passwordForm;

    @FXML
    private PasswordField txtConfirmPassword;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnRstPasswordOnAction(ActionEvent event) throws IOException {
        System.out.println("Password Recovery");
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/login-form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.passwordForm.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Sign-in");
    }

    @FXML
    void linkSignUpOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/signUp.fxml"));
        Stage stage = (Stage) passwordForm.getScene().getWindow();
        passwordForm.getChildren().clear();
        passwordForm.getChildren().add(rootNode);
        stage.setTitle("Sign Up");
        stage.centerOnScreen();
    }
}
