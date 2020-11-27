package hunter.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;

public class street {

    @FXML
    private Pane one, two, three, four, five, six, seven, nameEnter;
    @FXML
    private ImageView streetBcg,enemyOne,enemyTwo,enemyThree,enemyFour,enemyFive,enemySix,enemySeven;
    @FXML
    private Text scoreT;

    private int whichEnemy;
    private int killed = 0, score = 0, missedShots = 0;
    private Pane thisEnemy;
    private long start, millisElapsed;
    private MediaPlayer a;
    private boolean music=true;


    @FXML
    public void initialize(){
        streetBcg.setImage(new Image(getClass().getResource("/images/street/bcgStreet.png").toExternalForm()));
        music();
    }

    private void music() {
        Media med = new Media(getClass().getResource("/sounds/streetMusic.mp3").toExternalForm());
        a = new MediaPlayer(med);
        a.setVolume(0.6);
        a.setAutoPlay(true);
        a.setOnEndOfMedia(new Runnable() {
            public void run() {
                a.seek(Duration.ZERO);
            }
        });
    }


    public void start(ActionEvent event) throws IOException {
        nameEnter.setVisible(false);
        scoreT.setText("Score: " + score);
        missedShots=0;
        scoreCheck();
    }

    private void timer() {
        start = System.currentTimeMillis();
    }

    public void scoreCheck() throws IOException {
        if (score < 20) {
            enemy();
        }
    }

    public void missClick(ActionEvent event) {
        ++missedShots;
    }

    public  void random() {
        int lastEnemy = whichEnemy;
        Random random = new Random();
        whichEnemy = random.nextInt(7);
        if (whichEnemy == lastEnemy){
            random();
        }
    }

    public void body(ActionEvent event) throws IOException{
        ++score;
        scoreT.setText("Score: " + score);
        thisEnemy.setVisible(false);
        scoreCheck();
    }

    public void toMenu(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menuFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void enemy() {
        random();
        Pane[] enemies = {one, two, three, four, five, six, seven};
        ImageView[] terrorist = {enemyOne,enemyTwo,enemyThree,enemyFour,enemyFive,enemySix,enemySeven};
        thisEnemy = enemies[whichEnemy];
        terrorist[whichEnemy].setImage(new Image(getClass().getResource("/images/street/terrorist.png").toExternalForm()));
        thisEnemy.setVisible(true);

    }
}
