package lk.ijse.culinaryacademy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class dashboardDormController {
    @FXML
    private Button btnAccount;

    @FXML
    private Button btnNotification;

    @FXML
    private Button btnCourses;

    @FXML
    private Button btnGmail;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnEnroallment;

    @FXML
    private Button btnPayment;

    @FXML
    private Button btnCourseSchedule;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnStudentReg;

    @FXML
    private AnchorPane homePage;

    @FXML
    private AnchorPane paneMenu;

    @FXML
    private AnchorPane rootDashboard;

    @FXML
    private AnchorPane subMenu;

    @FXML
    private TextField txtsearch;

    @FXML
    void btnAccountOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/user.fxml"));
        Stage stage = (Stage) homePage.getScene().getWindow();
        homePage.getChildren().clear();
        homePage.getChildren().add(rootNode);
        stage.setTitle("Account Details");
        stage.centerOnScreen();
    }
    @FXML
    void btnCoursesOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/course.fxml"));
        Stage stage = (Stage) homePage.getScene().getWindow();
        homePage.getChildren().clear();
        homePage.getChildren().add(rootNode);
        stage.setTitle("Courses");
        stage.centerOnScreen();
    }

    @FXML
    void btnGmailOnAction(ActionEvent event) {

    }

    @FXML
    void btnHomeOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard-form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootDashboard.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/login-form.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootDashboard.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Sing-Up");
    }

    @FXML
    void btnEnroallmentOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/enrollment.fxml"));
        Stage stage = (Stage) homePage.getScene().getWindow();
        homePage.getChildren().clear();
        homePage.getChildren().add(rootNode);
        stage.setTitle("Student-Programe Enrollment");
        stage.centerOnScreen();
    }

    @FXML
    void btnNotificationOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/notification.fxml"));
        Stage stage = (Stage) homePage.getScene().getWindow();
        homePage.getChildren().clear();
        homePage.getChildren().add(rootNode);
        stage.setTitle("Notification");
        stage.centerOnScreen();
    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/payment.fxml"));
        Stage stage = (Stage) homePage.getScene().getWindow();
        homePage.getChildren().clear();
        homePage.getChildren().add(rootNode);
        stage.setTitle("Payment");
        stage.centerOnScreen();
    }

    @FXML
    void btnCourseScheduleOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/courseSchedule.fxml"));
        Stage stage = (Stage) homePage.getScene().getWindow();
        homePage.getChildren().clear();
        homePage.getChildren().add(rootNode);
        stage.setTitle("Programe Schedule");
        stage.centerOnScreen();
    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnStudentRegOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/student-form.fxml"));
        Stage stage = (Stage) homePage.getScene().getWindow();
        homePage.getChildren().clear();
        homePage.getChildren().add(rootNode);
        stage.setTitle("Student Details");
        stage.centerOnScreen();
    }

    @FXML
    void handleButtonAction(MouseEvent event) {

    }

}
