package hunter.dataHandling;

public class GameplayData {

    public static int CalculateScore(String finalTime, int score, int killed, int missedShots){

        int finalTimeSecInt = Integer.parseInt(finalTime);
        double kmf = killed + missedShots + finalTimeSecInt;
        double finScore = ((double) score / kmf) * 1000;
        return (int)finScore;

    }

}
