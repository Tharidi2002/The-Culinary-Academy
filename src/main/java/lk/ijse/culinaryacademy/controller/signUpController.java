package lk.ijse.culinaryacademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class signUpController {
    @FXML
    private RadioButton btnRadioA;

    @FXML
    private RadioButton btnRadioB;

    @FXML
    private Button btnSignUp;

    @FXML
    private Label lblDate;

    @FXML
    private Label lblEmailErrors;

    @FXML
    private Label lblPasswordErrors;

    @FXML
    private Hyperlink linkSignIn;

    @FXML
    private AnchorPane signupForm;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void btnRadioAOnAction(ActionEvent event) {

    }

    @FXML
    void btnRadioBOnAction(ActionEvent event) {

    }

    @FXML
    void btnSignUpOnAction(ActionEvent event) throws IOException {
        System.out.println("sign up alert");
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/login-form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.signupForm.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Sign-in");
    }

    @FXML
    void linkSignInOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/login-form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.signupForm.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Sign-in");
    }

}
