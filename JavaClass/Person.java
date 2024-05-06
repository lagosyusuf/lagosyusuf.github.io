public class Person {
   private String firstName;
   private String lastName;
   
   public void setFirstName(String firstNameToSet) {
      firstName = firstNameToSet;
   }
   
   public void setLastName(String lastNameToSet) {
      lastName = lastNameToSet;
   }
   
   public String getFullName() {
      return firstName + " " + lastName;
   }
}