/******************************************
 * Number In Word
 *
 *      Write a method called printNumberInWord. The method has one parameter number
 *      which is the whole number. The method need to print "ZERO", "ONE", "TWO", ....
 *      "NINE", "OTHER". If the parameter number is 0, 1, 2.....9 or other for any other number
 *      including negative numbers. It can be solved by using SWITCH or IF-ELSE statement.
 *******************************************/

public class Main {
    public static void main(String[] args) {
        NumberInWord.printNumberInWord(-1);
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(1);
        NumberInWord.printNumberInWord(2);
        NumberInWord.printNumberInWord(3);
        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(5);
        NumberInWord.printNumberInWord(6);
        NumberInWord.printNumberInWord(7);
        NumberInWord.printNumberInWord(8);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(111);
    }
}
