import java.util.Scanner;

public class DecimalToBinary {
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      int decimalInput;
      String binaryOutput;
      
      System.out.print("Enter a decimal number: ");
      decimalInput = scnr.nextInt();
      
      binaryOutput = Integer.toBinaryString(decimalInput);
      
      System.out.println("The binary representation of " + decimalInput +
                         " is " + binaryOutput);
   }
}
