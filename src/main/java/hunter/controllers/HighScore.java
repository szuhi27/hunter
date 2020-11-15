package hunter.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HighScore {

    //azért kell bele hogy át lehessen lépni a highscore oldalra, funkciók később

    //javafxben is hozzáadni a methodokat, onnan kiszedtem hogy fussék

    public void menuGoGo(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menuFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

}
