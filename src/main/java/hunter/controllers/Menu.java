package hunter.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class Menu {

    @FXML
    private ImageView menuBcg, playBcg, highscoreBcg, exitBcg, afghanButton, muteIV;
    @FXML
    private VBox buttonsVBox;
    @FXML
    private Pane maps;

    MediaPlayer a;
    private boolean music = true;


    //map choosing
    public void Play(ActionEvent event) {
        log.info("Getting map choosing buttons on");
        buttonsVBox.setVisible(false);
        //button images will be here
        maps.setVisible(true);
    }

    //afghan map
    public void goAfghanistan(ActionEvent event) throws IOException {
        log.info("Changing scene to Afghanistan");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/playAfghanFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        a.pause();
    }

    public void highscore(ActionEvent event) throws IOException {
        log.info("Changing scene to high score Scene");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/highscore.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        a.pause();
    }

    public void exitApp(ActionEvent event) {
        log.info("Exiting app...");
        Platform.exit();
    }

    public void mute(ActionEvent event) {
        if (music) {
            log.info("Music muted");
            music = false;
            a.pause();
            muteIV.setImage(new Image(getClass().getResource("/images/menuS/unmuteBcg.png").toExternalForm()));
        } else {
            log.info("Music unmuted");
            music = true;
            a.play();
            muteIV.setImage(new Image(getClass().getResource("/images/menuS/muteBcg.png").toExternalForm()));
        }


    }
}
