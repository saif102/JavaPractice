package com.saifulsrabon;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
    }

    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5: case 6:
                System.out.println("Weekend: Saturday or Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    /*private static void printDayOfTheWeek(int day){
        if (day == 0){
            System.out.println("Monday");
        }else if (day == 1){
            System.out.println("Tuesday");
        }else if (day == 2){
            System.out.println("Wednesday");
        }else if (day == 3){
            System.out.println("Thursday");
        }else if (day == 4){
            System.out.println("Friday");
        }else if (day == 5 || day == 6){
            System.out.println("Weekend: Saturday or Sunday.");
        }else
            System.out.println("Invalid day.");


    }*/
}
