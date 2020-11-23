package hunter.dataHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GameplayData {

    //Kiszámolja a scoret, a win()-be kellesz meghívni
    public static int CalculateScore(String finalTime, int score, int killed, int missedShots){

        int finalTimeSecInt = Integer.parseInt(finalTime);
        double kmf = killed + missedShots + finalTimeSecInt;
        double finScore = ((double) score / kmf) * 1000;
        return (int)finScore;

    }

    //Új mentés rögzítése, ugyanúgy a win()-be, de a CalculateScore() után!!
    public static void SaveGameData(String file, String name, int score, String time, int missed, int killed) throws IOException {

            FileWriter fw = new FileWriter(file,true);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(name);
            writer.write(" "+ score);
            writer.write(" "+ time);
            writer.write(" "+ missed);
            writer.write(" "+ killed);
            writer.newLine();
            writer.close();

    }

}
