module com.spaceinvaders.spaceinvaders2 {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spaceinvaders.spaceinvaders2 to javafx.fxml;
    exports com.spaceinvaders.spaceinvaders2;
}