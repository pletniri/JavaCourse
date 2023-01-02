public class getDurationString {

    public static void main(String[] args) {
        printYearsAndDays(5258240);
//        System.out.println(getDurationString(63, 25));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            System.out.println("Input should be more than zero.");
        }
        // "XXh YYm ZZs"
        //transform into hours
        int remainder = seconds % 60;
        int minutes = seconds - remainder;
        String result = getDurationString(minutes, remainder);
        return result;

//        int minutesRemainder = minutes % 60;
//        int hours = (minutes - minutesRemainder) / 60;
//        String result = "{hours}h {minutesRemainder}m {remainder}s";
//        return result;
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0) {
            System.out.println("Input should be more than zero.");
        }

        int minutesRemainder = minutes % 60;
        int hours = (minutes - minutesRemainder) / 60;

        String result = "%sh %sm %ss".formatted(hours, minutesRemainder, seconds);
        return result;
        //String str = "First %s, then %s".formatted(foo, bar);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            //"XX min = YY y and ZZ d". 5258240
            long minInYear = 365 * 24 * 60;
            long minInDay = 24 * 60;
            long minRemainder = minutes % minInDay; //minutes that do not make a whole day
            long days = (minutes - minRemainder) / minInDay; //how many whole days;
            long daysRemainder = days % 365;
            long years = (days - daysRemainder) / 365;

            System.out.println(minutes + " min = " + years + " y and " + daysRemainder + " d");
        }
    }

    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        } else if (first == second && second == third && first == third
        ) {
            System.out.println("All numbers are equal");
        } else if (first != second && second != third && first != third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

    public class PlayingCat {
        public static boolean isCatPlaying(boolean summer, int temperature) {
            if (summer && (temperature >= 25 && temperature <= 45)) {
                return true;
            } else if (!summer && (temperature >= 25 && temperature <= 35)) {
                return true;
            } else {
                return false;
            }
        }

    }

}

