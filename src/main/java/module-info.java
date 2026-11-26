module com.ejemplo.bibliotecafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ejemplo.bibliotecafx to javafx.fxml;
    exports com.ejemplo.bibliotecafx;
    exports com.ejemplo.bibliotecafx.controller;
    opens com.ejemplo.bibliotecafx.controller to javafx.fxml;
}