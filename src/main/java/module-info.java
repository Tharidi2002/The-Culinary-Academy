module lk.ijse.culinaryacademy {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens lk.ijse.culinaryacademy.controller to javafx.fxml;
    exports lk.ijse.culinaryacademy;
}