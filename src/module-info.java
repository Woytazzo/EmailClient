module JavaFxEmailClientCourse2 {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens com.uchee;
    opens com.uchee.view;
    opens com.uchee.controller;
}