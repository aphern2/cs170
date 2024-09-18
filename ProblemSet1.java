//* This code is my own work. It was written without consulting code written by other students or code from online resources.
// ANA HERNANDEZ */

public class ProblemSet1 {
    //DATE
    // Q a :
    public static String getAmerican(String day, String month, int date, int year) {
        return (day + ", " + month + " " + date + ", " + year);
    }

    // Q b :
    public static String getEuropean(String day, int date, String month, int year) {
        return (day + " " + date + " " + month + "," + year);
    }

    // Main method
    public static void main(String[] args) {
        // DATE
        System.out.println(getAmerican("Monday", "September", 9, 2024));
        System.out.println(getEuropean("Monday", 9, "September", 2024));
        // TIME
        int hours;
        hours = 12;
        int minutes;
        minutes = 30;
        int seconds;
        seconds = 12;
        System.out.println("Current time is: " + hours + ":" + minutes + ":" + seconds);
        System.out.println("Number of seconds since midnight: " + secondsSinceMidnight(12, 20, 10));
        System.out.println("Seconds left today: " + secondsLeftToday(10, 8, 60));
        System.out.println("Percent of day passed: " + percentOfDayPassed(9, 24, 15) + "%");
        //MULTADD
        double a =  Math.cos((Math.PI)/4.0);
        double b = 1.0/2.0;
        double c = Math.sin((Math.PI)/4.0) ;
        System.out.println(multadd(a,b,c));

        double a1 = 1.0;
        double b1 = Math.log(10);
        double c1 = Math.log(20);
        System.out.println(multadd(a1,b1,c1));

        System.out.println(yikes(4));
        System.out.println(yikes(2));
        System.out.println(yikes(45));
        System.out.println(yikes(10));

    }

    //TIME
    // B
    public static int secondsSinceMidnight(int hours, int minutes, int seconds) {
        return (((hours * 3600) + (minutes * 60) + seconds) - 43200);
    }

    //C
    public static int secondsLeftToday(int hours, int minutes, int seconds) {
        return (86400 - (hours * 3600 + minutes * 60 + seconds));
    }

    //D
    public static double percentOfDayPassed(int hours, int minutes, int seconds) {
        return ((hours * 3600 + minutes * 60 + seconds) / 86400.0) * 100;
    }

    //Multadd
    //B

    public static double multadd(double a, double b, double c) {
        return (a*b + c);
    }

    public static double yikes(double x){
        double a2 = x;
        double b2 = Math.exp(-x);
        double c2 = Math.sqrt(1.0 - b2);
      double result = multadd(a2,b2,c2);
        return(result);
    }







}