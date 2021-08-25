module com.example.secondfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.secondfx to javafx.fxml;
    exports com.example.secondfx;
}