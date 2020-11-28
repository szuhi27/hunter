package hunter.controllers;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.io.IOException;

public class syria {

    @FXML
    private Pane one, two, three, four, five, six, seven, nameEnter, results, ingameScore;
    @FXML
    private Text scoreT, killedT, missedT, finalTimeT, goodJobT, finalScoreT;
    @FXML
    private Label timeL;
    @FXML
    private TextField nameTF;
    @FXML
    private Button exitB, muteB;
    @FXML
    private ImageView syriaBcg,enemyOne,enemyTwo,enemyThree,enemyFour,enemyFive,enemySix,enemySeven;

    private int whichEnemy;
    private int killed = 0, score = 0, missedShots = 0;
    private Pane thisEnemy;
    private long start, millisElapsed;
    private MediaPlayer a;
    private boolean music=true;

    public void initialize(){
        syriaBcg.setImage(new Image(getClass().getResource("/images/syria/syria.png").toExternalForm()));
        music();
    }

    private void music() {
        Media med = new Media(getClass().getResource("/sounds/syriaMusic.mp3").toExternalForm());
        a = new MediaPlayer(med);
        a.setVolume(0.4);
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
        timer();
    }

    private void timer() {
        start = System.currentTimeMillis();
        Timeline timeline = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            millisElapsed = System.currentTimeMillis() - start;
            timeL.setText(DurationFormatUtils.formatDuration(millisElapsed, "mm:ss"));
        }), new KeyFrame(Duration.seconds(1)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void scoreCheck() throws IOException {
        if (score < 100) {
            enemy();
        } else {
            win();

        }
    }

    public void enemy() {
        random();
        Pane[] enemies = {one, two, three, four, five, six, seven};
        ImageView[] terrorist = {enemyOne,enemyTwo,enemyThree,enemyFour,enemyFive,enemySix,enemySeven};
        thisEnemy = enemies[whichEnemy];
        if(whichEnemy==6) {
            enemySeven.setImage(new Image(getClass().getResource("/images/syria/terroristWalk.png").toExternalForm()));
        } else if (whichEnemy==0 || whichEnemy==1) {
            terrorist[whichEnemy].setImage(new Image(getClass().getResource("/images/syria/terroristStanding.png").toExternalForm()));
        } else {
            terrorist[whichEnemy].setImage(new Image(getClass().getResource("/images/syria/terroristPistol.png").toExternalForm()));
        }
        thisEnemy.setVisible(true);

    }
}
