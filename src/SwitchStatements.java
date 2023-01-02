public class SwitchStatements {
    public static void main(String[] args) {

        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("The letter is " + letter + " and the word is Able");
                break;
            case 'B':
                System.out.println("The letter is " + letter + " and the word is Baker");
                break;
            case 'C':
                System.out.println("The letter is " + letter + " and the word is Charlie");
                break;
            case 'D':
                System.out.println("The letter is " + letter + " and the word is Dog");
                break;
            case 'E':
                System.out.println("The letter is " + letter + " and the word is Easy");
                break;
            default:
                System.out.println("No such letter");
                break;
        }

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

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
}

