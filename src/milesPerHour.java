public class milesPerHour {

    public static void main(String[] args) {
        printConversion(45.00);



    }


//    static double milesPerHour;

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0.00) {
            return -1;
        }else{
            long milesPerHour = Math.round(kilometersPerHour * 0.62137119);
            return milesPerHour;
        }
    }
    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }


}


