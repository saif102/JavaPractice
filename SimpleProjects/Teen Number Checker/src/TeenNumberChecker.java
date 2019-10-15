public class TeenNumberChecker {

    public static boolean hasTeen(int parOne, int parTwo, int parThree){

        if((parOne >= 13 && parOne <= 19) || (parTwo >= 13 && parTwo <= 19) || (parThree >= 13 && parThree <= 19)){

            return true;
        }
        return false;
    }

    public static boolean isTeen (int checkTeen){
        if (checkTeen >= 13 && checkTeen <= 19) {
            return true;
        }
        return false;
    }

}
