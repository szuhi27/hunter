package hunter.controllers;

import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Random;

public class street {

    private int whichEnemy;
    private Pane thisEnemy;

    public  void random() {
        int lastEnemy = whichEnemy;
        Random random = new Random();
        whichEnemy = random.nextInt(7);
        if (whichEnemy == lastEnemy){
            random();
        }
    }

    public void body(ActionEvent event) {

        thisEnemy.setVisible(false);

    }
}
