/*********************************************
Sum 3 and 5 Challenge

    Create a for statement using a range of numbers from 1 to 1000 inclusive.
    Print all the numbers that can be divided with both 3 and also with 5.
    For those numbers that met the above conditions, print out the number.
    break out of the loop once you find 5 numbers that met the above conditions.
    After breaking out the loop print the sum of the numbers that met the above conditions.

 ***********************************************/

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for(int n = 1; n <= 1000; n++){
            if((n % 3 == 0) && (n % 5 == 0)){
                count++;
                sum += n;
                System.out.println("Found number = " + n);
                if (count == 5){
                    System.out.println("Loop of five number has been reached. Loop is exiting...");
                    System.out.println("**************************");
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);

    }




}
