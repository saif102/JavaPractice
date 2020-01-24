public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if (year < 1 || year > 9999){
            return false;
        }else if ((year % 4 == 0) && (year % 100 != 0)){
            return true;
        }else if (year % 400 == 0){
            return true;
        }else {
            return false;
        }

    }

    /*public static int getDaysInMonth (int month, int year){

        int days = -1;
        if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {

            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 2:
                    if(isLeapYear(year)){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
                default:
                    days = 30;
                    break;

            }
        }
        return days;

    }*/

    public static int getDaysInMonth(int month, int year) {
        int days;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 30;
                break;
        }
        return days;
    }


}



