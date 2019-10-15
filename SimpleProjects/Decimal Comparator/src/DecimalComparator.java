public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double parOne, double parTwo){

        if((Math.floor(parOne * 1000)) == (Math.floor(parTwo * 1000))){
            return true;
        }
        return false;
    }

}
