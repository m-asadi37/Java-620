package org.example.javafxgame2048;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import org.example.javafxgame2048.logic.Board;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    private GridPane grid;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Board board = new Board();

        updateGrid(board.getBoard());

        grid.setFocusTraversable(true);
        Platform.runLater(() -> grid.requestFocus());

        grid.setOnKeyPressed(event -> {
            KeyCode code = event.getCode();

            switch (code) {
                case RIGHT -> board.moveRight();
                case LEFT -> board.moveLeft();
                case UP -> board.moveUp();
                case DOWN -> board.moveDown();
            }

            board.display();
            updateGrid(board.getBoard());
        });
    }

    private void updateGrid(int[][] arr) {
        grid.getChildren().clear();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Label l = createStyledLabel(arr[i][j]);
                grid.add(l, j, i);
            }
        }
    }


    private Label createStyledLabel(int value) {
        Label label = new Label(value == 0 ? "" : String.valueOf(value));

        // Base styles
        label.setMinSize(80, 80);
        label.setMaxSize(80, 80);
        label.setAlignment(Pos.CENTER);

        // Font styles based on value length
        label.setFont(Font.font("Arial", FontWeight.BOLD, 32));

        // Background color and text color based on value
        String backgroundColor;
        String textColor = switch (value) {
            case 0 -> {
                backgroundColor = "#cdc1b4";
                yield "#776e65";
            }
            case 2 -> {
                backgroundColor = "#eee4da";
                yield "#776e65";
            }
            case 4 -> {
                backgroundColor = "#ede0c8";
                yield "#776e65";
            }
            case 8 -> {
                backgroundColor = "#f2b179";
                yield "#f9f6f2";
            }
            case 16 -> {
                backgroundColor = "#f59563";
                yield "#f9f6f2";
            }
            case 32 -> {
                backgroundColor = "#f67c5f";
                yield "#f9f6f2";
            }
            case 64 -> {
                backgroundColor = "#f65e3b";
                yield "#f9f6f2";
            }
            case 128 -> {
                backgroundColor = "#edcf72";
                yield "#f9f6f2";
            }
            case 256 -> {
                backgroundColor = "#edcc61";
                yield "#f9f6f2";
            }
            case 512 -> {
                backgroundColor = "#edc850";
                yield "#f9f6f2";
            }
            case 1024 -> {
                backgroundColor = "#edc53f";
                yield "#f9f6f2";
            }
            case 2048 -> {
                backgroundColor = "#edc22e";
                yield "#f9f6f2";
            }
            default -> {
                backgroundColor = "#3c3a32";
                yield "#f9f6f2";
            }
        };

        // Apply styles
        label.setStyle(String.format(
                "-fx-background-color: %s; " +
                        "-fx-text-fill: %s; " +
                        "-fx-background-radius: 5; " +
                        "-fx-padding: 10; " +
                        "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.2), 5, 0, 2, 2);",
                backgroundColor, textColor
        ));

        return label;
    }
}
