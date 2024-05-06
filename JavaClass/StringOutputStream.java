
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringOutputStream {
   public static void main(String[] args) {
      String item;
      int quantity;
      int discount;

      StringWriter itemCharStream = new StringWriter();
      PrintWriter itemOSS = new PrintWriter(itemCharStream);

      item = "Headphones";
      quantity = 14;
      discount = 30;

      itemOSS.println(item + " x" + quantity);
      itemOSS.print(discount + "% off");

      System.out.print(itemCharStream.toString());
   }
}