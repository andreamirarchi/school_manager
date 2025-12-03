module com.example.registroelettronico {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires fontawesomefx;
    requires itextpdf;
    requires jbcrypt;

    opens application to javafx.fxml;
    exports application;

    opens application.controller.prof to javafx.fxml;
    exports application.controller.prof;
    opens application.controller to javafx.fxml;
    exports application.controller;
}