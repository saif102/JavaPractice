public class Main {
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.1755, 3.1756));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
    }
}
