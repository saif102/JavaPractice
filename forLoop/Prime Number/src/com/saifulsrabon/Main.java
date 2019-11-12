/*************************************************
Prime Number

    Create a for statement using any range of numbers
    Determine if the number is a prime number using the isPrime method
    If it is a prime number, print it out AND increment a count of the number of prime numbers found
    If the count is 10, exit the for loop

 ***************************************************/


package com.saifulsrabon;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10){
                    System.out.println("Exiting the 'for' loop...");
                    System.out.println("**************************");
                    break;
                }
            }
        }


        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){     //possible to use (long) Math.sqrt(n) instead of "n/2"
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}
