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


}
