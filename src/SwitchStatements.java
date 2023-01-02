public class SwitchStatements {
    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2, 2022));

//        char letter = 'A';
//        switch (letter) {
//            case 'A':
//                System.out.println("The letter is " + letter + " and the word is Able");
//                break;
//            case 'B':
//                System.out.println("The letter is " + letter + " and the word is Baker");
//                break;
//            case 'C':
//                System.out.println("The letter is " + letter + " and the word is Charlie");
//                break;
//            case 'D':
//                System.out.println("The letter is " + letter + " and the word is Dog");
//                break;
//            case 'E':
//                System.out.println("The letter is " + letter + " and the word is Easy");
//                break;
//            default:
//                System.out.println("No such letter");
//                break;
//        }
//
//        printDayOfWeek(0);
//        printDayOfWeek(1);
//        printDayOfWeek(2);
//        printDayOfWeek(3);
//        printDayOfWeek(4);
//        printDayOfWeek(5);
//        printDayOfWeek(6);

    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " means " + dayOfTheWeek);

    }

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("other");
                break;
        }


    }


    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) {
            return false;
        } else if(year % 4 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0){
            return false;
        } else if (year % 4 ==0) {
            return true;
        }
        return false;
    }

    public static int  getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        ;
        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 8, 10, 12 -> 31;
            case 4, 6, 7, 9, 11 -> 30;
            case 2 -> {
                boolean yearLeap = isLeapYear(year);
                if (yearLeap) {
                    yield 29;
                } else yield 28;
            }

            default -> -1;

        };

    }

}

