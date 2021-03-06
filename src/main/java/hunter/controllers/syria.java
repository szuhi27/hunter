package hunter.controllers;

import hunter.dataHandling.GameplayData;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.io.IOException;
import java.util.Random;

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

    @FXML
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

    public void random() {
        int lastEnemy = whichEnemy;
        Random random = new Random();
        whichEnemy = random.nextInt(7);

        if (whichEnemy == lastEnemy){
            random();
        }
    }

    public void win() throws IOException {
        ingameScore.setVisible(false);
        exitB.setVisible(false);
        results.setVisible(true);

        String name = GameplayData.getName(nameTF);
        goodJobT.setText("Good job " + name + "!");
        finalTimeT.setText(DurationFormatUtils.formatDuration(millisElapsed, "mm:ss"));

        String finalTimeSecT = (DurationFormatUtils.formatDuration(millisElapsed, "ss"));
        killedT.setText("and killed " + killed + " terrorists,");
        missedT.setText(GameplayData.missedText(missedShots));

        int finalScore = GameplayData.CalculateScore(finalTimeSecT, score, killed, missedShots);
        finalScoreT.setText("Your calculated score is: " + finalScore);
        GameplayData.SaveGameData("scoresSyria.txt", name, finalScore, finalTimeT.getText(), missedShots,killed);
    }

    public void body(ActionEvent event) throws IOException {
        shot();
        ++score;
        ++killed;
        scoreT.setText("Score: " + score);
        thisEnemy.setVisible(false);
        scoreCheck();
    }

    public void head(ActionEvent event) throws IOException {
        shot();
        score = score + 2;
        ++killed;
        scoreT.setText("Score: " + score);
        thisEnemy.setVisible(false);
        scoreCheck();
    }

    public void missClick(ActionEvent event) {
        ++missedShots;
        shot();
    }

    private void shot(){
        Media med = new Media(getClass().getResource("/sounds/shot.mp3").toExternalForm());
        MediaPlayer shot = new MediaPlayer(med);
        shot.play();
    }

    public void toMenu(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menuFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
        a.pause();
    }

    public void mute(ActionEvent event){
        if (music){
            music = false;
            a.pause();
            muteB.setText("Unmute");
        } else {
            music = true;
            a.play();
            muteB.setText("Mute");
        }
    }
}
