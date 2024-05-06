import java.util.*;


public class CallFood {
   public static void main(String[] args) {
      FoodType order1 = new FoodType("Steak");
      FoodType order2 = new FoodType("Burrito");
      FoodType order3 = new FoodType("Lobster");
      FoodType order4 = new FoodType("Bread");

      order2.print();

      System.out.println("Next ID: " + FoodType.getNextId());
   }
}