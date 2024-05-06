import java.util.Scanner;


public class sampleFlyDrive {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double miles;   // user defined distance
        double hoursFly;    //Time to fly distance
        double hoursDrive;  //Time to drive distance

        //prompt user for distance
        System.out.println("Enter user distance in miles: ");
        miles = scnr.nextDouble();
        //Calculate the corresponding time to fly/drive distance

        hoursFly = miles / 500.0;
        hoursDrive = miles / 60.0;

        //Output resulting Values
        System.out.printf("%.2f miles would take:\n", miles);
        System.out.printf("%.2f hours to fly\n", hoursFly);
        System.out.printf("%.2f hours to drive\n", hoursDrive);
    }
}