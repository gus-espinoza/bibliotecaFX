module com.ejemplo.bibliotecafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ejemplo.bibliotecafx to javafx.fxml;
    exports com.ejemplo.bibliotecafx;
}