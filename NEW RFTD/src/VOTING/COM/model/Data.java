package VOTING.COM.model;

public class Data {
    static int pres1 = 0, pres2 = 0, sec1 = 0, sec2 = 0, sec3 = 0, tre1 = 0, tre2 = 0;

    static boolean pres = false, sec = false, tre = false;

    public static void addPres(int pos){
        switch (pos) {
            case 1:
                pres1++;
                break;
            case 2:
                pres2++;
                break;
        }
    }
    public static int getPres(int pos){
        switch (pos) {
            case 1:
                return pres1;
            case 2:
                return pres2;
        }
        return  0;
    }
    public static void addSec(int pos){
        switch (pos) {
            case 1:
                sec1++;
                break;
            case 2:
                sec2++;
                break;
            case 3:
                sec3++;
                break;
        }
    }
    public static int getSec(int pos){
        switch (pos) {
            case 1:
                return sec1;
            case 2:
                return sec2;
            case 3:
                return sec3;
        }
        return 0;
    }
    public static void addTre(int pos){
        switch (pos) {
            case 1:
                tre1++;
                break;
            case 2:
                tre2++;
                break;
        }
    }
    public static int getTre(int pos){
        switch (pos) {
            case 1:
                return tre1;
            case 2:
                return tre2;
        }
        return 0;
    }

    public static void reset(){
        pres = false;
        sec = false;
        tre = false;
    }
}
