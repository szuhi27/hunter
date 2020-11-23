package hunter.dataHandling;

public class DataRowSorter {

    public static String checkScore(int score){
        if (score > -1 && score < 10){
            return "        ";
        } else if(score > 9 && score < 100){
            return "       ";
        } else if(score > 99 && score < 1000){
            return "      ";
        } else {
            return "     ";
        }
    }

    public static String checkMisses(int miss) {
        if (miss > -1 && miss < 10){
            return "       ";
        } else if(miss > 9 && miss < 100){
            return "      ";
        } else {
            return "     ";
        }
    }

    public static String checkKills(int kills){
        if(kills < 100){
            return "      ";
        } else {
            return "     ";
        }
    }

}
