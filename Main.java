public class Main {
    public static void main(String[] args)
    {

    }


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0  || height <=0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        int bucketNeeded = (int) Math.ceil((width * height) / areaPerBucket);
        int bucketToBuy = bucketNeeded - extraBuckets;
        return bucketToBuy;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0  || height <=0 || areaPerBucket <= 0) {
            return -1;
        }

        int bucketToBuy = (int) Math.ceil((width * height) / areaPerBucket);
        return bucketToBuy;

    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int bucketToBuy = (int) Math.ceil(area / areaPerBucket);
        return bucketToBuy;

    }

//    NOTE: Use the method Math.ceil to round the number of calculated buckets (double) then convert it
//    into an int before returning the value from the methods.


}