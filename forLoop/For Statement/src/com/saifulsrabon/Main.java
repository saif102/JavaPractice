/**********************************************
Counting Interest Rates:

    Using the for statement, call the calculateInterest method with
    The amount if 10000 with an interestRate of 2,3,4,5,6,7 and 8
    Print the results to the console window

    Is it possible to do the same thing in backwards? (e.g. back from 8% to 2%)
 **********************************************/



package com.saifulsrabon;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {


	for (int i = 2; i < 9; i++){
        System.out.println("10.000€ at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
    }

        System.out.println("*******************************");

	for (int i = 8; i >= 2; i--){
            System.out.println("10.000€ at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
	}

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
        }

}
