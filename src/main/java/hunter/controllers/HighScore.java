package hunter.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.commons.lang3.SystemUtils;

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

    @FXML
    public void initialize() {
        hsBcg.setImage(new Image(getClass().getResource("/images/menuS/menuBcg.png").toExternalForm()));
        menuButtonIV.setImage(new Image(getClass().getResource("/images/menuS/menuButtonBcg.png").toExternalForm()));
        muteIV.setImage(new Image(getClass().getResource("/images/menuS/muteBcg.png").toExternalForm()));
        loadIV.setImage(new Image(getClass().getResource("/images/menuS/loadBcg.png").toExternalForm()));
        clearIV.setImage(new Image(getClass().getResource("/images/menuS/clearBcg.png").toExternalForm()));
        music();
        choiceBox.getItems().addAll("Afghan","Syrian");
        getOS();
    }

    private void getOS() {
        if (SystemUtils.IS_OS_WINDOWS_10){
            textArea.setFont(Font.font("monospace"));
            titles.setFont(Font.font("monospace"));
            placements.setFont(Font.font("monospace"));
        } else if (SystemUtils.IS_OS_LINUX){
            textArea.setFont(Font.font("FreeMono"));
            titles.setFont(Font.font("FreeMono"));
            placements.setFont(Font.font("FreeMono"));
        }
    }

    static class result{
        int score,misses,kills;
        String name,time;
        public result( String name, int score, String time, int misses, int kills){
            this.name = name;
            this.score = score;
            this.time = time;
            this.misses = misses;
            this.kills = kills;
        }
    }

    public void menuGoGo(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menuFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void music() {
    }

}
