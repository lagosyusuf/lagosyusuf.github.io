public class CallAirplane {
    public static void main(String[] args) {
        Airplane airbus330 = new Airplane();
  
        airbus330.addPassengers(7);
        airbus330.addPassengers(10);
  
        System.out.println(airbus330.getAvailableSeats() + " seats");
     }
}
