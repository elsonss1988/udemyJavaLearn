module com.example.fifthfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fifthfx to javafx.fxml;
    exports com.example.fifthfx;
}