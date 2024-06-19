public class CelciusToFarenheitConverter {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        // Implicit Casting

        // Local variable
        double tempInCelcius = 0;

        if(args.length > 0) {
             tempInCelcius = Integer.parseInt(args[0]);
        } else {
            System.out.println("Invalid Argument. Please pass valid temperature value.");
            return;
        }

        // celcisus * 9 / 5 + 32
        double tempInFaren = tempInCelcius * 9 / 5 + 32;

        System.out.println(tempInCelcius + " Celcius is equal to " + tempInFaren + " Farenheit");
//        byte byteOut = (byte) tempInFaren; // Explicit Casting
//        short shortOut = (short) tempInFaren; // Explicit Casting
//        long longOut = (long) tempInFaren;
//        float floatOut = (float) tempInFaren;
//        double doubleOut = (double) tempInFaren;


//        System.out.println(byteOut);
//        System.out.println(shortOut);
//        System.out.println(longOut);
//        System.out.println(floatOut);

    }
}
