module org.example.javafxgame2048 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.example.javafxgame2048 to javafx.fxml;
    exports org.example.javafxgame2048;
}