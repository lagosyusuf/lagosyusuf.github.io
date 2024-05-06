public class TimeTravelingAstronaut {
   public static Double calcTimeElapsed(Double speedRatio, Integer time) {
      // Lorentz factor
      Double lorentzFactor = 1.0 / Math.sqrt(1 - (Math.pow(speedRatio, 2)));
      Double timeElapsed = time * lorentzFactor;
        
      return timeElapsed;
   }
 
   public static void main(String[] args) {
      Double astronautSpeed = 0.9; // % of the speed of light
      Integer travelTime = 10; // In years
      Double earthTime = 0.0; // In years
        
      earthTime = calcTimeElapsed(astronautSpeed, travelTime);
        
      System.out.println(earthTime +
                  " years have passed on Earth!");        
   }
}