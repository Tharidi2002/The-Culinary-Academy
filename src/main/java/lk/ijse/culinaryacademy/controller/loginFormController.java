package lk.ijse.culinaryacademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class loginFormController {
    @FXML
    private Hyperlink linkForgot;

    @FXML
    private Button btnSignin;

    @FXML
    private Button btnSignup;

    @FXML
    private AnchorPane coverPage;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblErrors;

    @FXML
    private AnchorPane loginForm;

    @FXML
    private AnchorPane rootLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void linkForgotOnAction(ActionEvent event)  throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/reSitPassword.fxml"));
        Stage stage = (Stage) loginForm.getScene().getWindow();
        loginForm.getChildren().clear();
        loginForm.getChildren().add(rootNode);
        stage.setTitle("Re-set Password");
        stage.centerOnScreen();
    }

    @FXML
    void btnSigninOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard-form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootLogin.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
    }

    private void checkCredential(String username, String password) {

    }

    @FXML
    void btnSignupOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/signUp.fxml"));
        Stage stage = (Stage) loginForm.getScene().getWindow();
        loginForm.getChildren().clear();
        loginForm.getChildren().add(rootNode);
        stage.setTitle("Sign Up");
        stage.centerOnScreen();
    }

    @FXML
    void handleButtonAction(MouseEvent event) {

    }
}
