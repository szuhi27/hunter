package hunter.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HighScore {

    @FXML
    private ImageView hsBcg,muteIV,loadIV,menuButtonIV,clearIV;
    @FXML
    private TextArea textArea,placements;
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private Text titles;
    @FXML
    private Pane confirmPane;

    private MediaPlayer a;
    private boolean isThereData = false, music=true;
    private String whichMap;


    public void menuGoGo(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menuFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

}
