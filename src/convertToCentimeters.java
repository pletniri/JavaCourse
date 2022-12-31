public class convertToCentimeters {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(240));
        System.out.println(convertToCentimeters(5, 6));

    }

    public static double convertToCentimeters(int inches){
        //convert to centimeters and pass back a double
        double centimeters = (double) inches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int feet, int remainder){
        //convert feet and inches to just inches, calls the first
        // method and returns a double
        int inches =  (feet * 12) + remainder;
        double result = convertToCentimeters(inches);

        return result;

    }

}
