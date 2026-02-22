package org.example.javafxgame2048;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println("log....");
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
