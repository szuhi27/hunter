package hunter.dataHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GameplayData {
    
        public static String getName(TextField tf) {
        Text nameT = new Text();
        String[] name = tf.getText().split(" ");
        if (name.length==0){
            nameT.setText("AAA");
        }else if (tf.getText() != null && !tf.getText().isEmpty() && name[0].length() == 3) {
            nameT.setText(name[0].toUpperCase());
        } else if (tf.getText() != null && !tf.getText().isEmpty() && name[0].length() > 3){
            nameT.setText(name[0].toUpperCase().substring(0,3));
        } else {
            nameT.setText("AAA");
        }
        return nameT.getText();
    }
    
        public static String missedText(int missedShots){
        String missesText = "";
        if (missedShots == 0) {
            missesText="and you missed 0 shots. Nice!";
        } else if (missedShots < 10) {
            missesText="and missed only " + missedShots + " shots.";
        } else {
            missesText="but missed " + missedShots + " shots.";
        }
        return missesText;
    }

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
