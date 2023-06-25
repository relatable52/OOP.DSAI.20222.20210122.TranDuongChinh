package hust.soict.dsai.javafx;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;

public class PaintController {

    @FXML // fx:id="drawingAreaPane"
    private Pane drawingAreaPane; // Value injected by FXMLLoader
    
    @FXML
    private VBox controlPane;

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
    	drawingAreaPane.getChildren().add(newCircle);
    }

}
