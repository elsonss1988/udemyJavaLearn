module com.example.jdbcfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jdbcfx to javafx.fxml;
    exports com.example.jdbcfx;
}