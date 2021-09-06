module com.example.fourthfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fourthfx to javafx.fxml;
    exports com.example.fourthfx;
}