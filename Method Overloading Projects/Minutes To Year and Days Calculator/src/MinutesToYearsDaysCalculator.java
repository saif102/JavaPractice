public class MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE_MASSAGE = "Invalid Value";

    public static void printYearsAndDays(long minutes){


        long years = ((minutes / 60 / 24) / 365);
        long days = ((minutes / 60 / 24) % 365);


        if (minutes < 0){
            System.out.println(INVALID_VALUE_MASSAGE);
        }
        else{
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }


    }
}
