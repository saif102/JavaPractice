

public class CentimetersCalculator {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || (inches <0 || inches > 12)){
            System.out.println("Invalid input.");
            return -1;
        }
        double centimeters = feet * 30.4800;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches are equal to " + centimeters + " centimeters.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0){
            System.out.println("Invalid input.");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainInch = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet " + remainInch + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainInch);
    }


}
