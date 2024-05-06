import java.util.Scanner;

public class StringInputStream {
   public static void main(String[] args) {
      String item1Info = "Pen 5 4";
      String item2Info = "Mug 15 14";
      String item3Info = "Book 21 22";

      Scanner itemISS = new Scanner(item2Info);
      String item;
      int quantity;
      int price;

      item = itemISS.next();
      price = itemISS.nextInt();
      quantity = itemISS.nextInt();

      System.out.println(item + " x" + quantity);
      System.out.print("Price: " + price);
   }
}