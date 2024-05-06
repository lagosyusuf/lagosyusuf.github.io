import java.util.Scanner;

public class FlyDrive {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      Double distMiles; 
      Double hoursFly;
      Double hoursDrive;

      System.out.print("Enter a distance in miles: ");
      distMiles = scnr.nextDouble();

      hoursFly = distMiles / 500.0;
      hoursDrive = distMiles / 60.0;

      System.out.println(distMiles + " miles would take:");
      System.out.println(hoursFly + " hours to fly");
      System.out.println(hoursDrive + " hours to drive");
   }
}
