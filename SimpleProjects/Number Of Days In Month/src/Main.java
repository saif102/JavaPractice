/*******************************
 * Number of Days In a Month
 *
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
 * A Year is a leap year if is divisible by 4 but not by 100, or it is divisible by 400.
 *
 * Write another method getDaysInMonth with two parameters month and year. Both of type int.
 * If parameter months is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 then return -1.
 * This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
 * Please check if the year using the method isLeapYear described above.
 ***************************************/

public class Main {

    public static void main(String[] args) {

        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));

        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2002));

    }
}
