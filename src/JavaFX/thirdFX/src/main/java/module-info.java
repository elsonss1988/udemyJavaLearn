module com.example.thirdfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thirdfx to javafx.fxml;
    exports com.example.thirdfx;
}