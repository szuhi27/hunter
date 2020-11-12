package hunter.controllers;

import java.util.Random;

public class street {

    private int whichEnemy;

    public  void random() {
        int lastEnemy = whichEnemy;
        Random random = new Random();
        whichEnemy = random.nextInt(7);
        if (whichEnemy == lastEnemy){
            random();
        }
    }

}
