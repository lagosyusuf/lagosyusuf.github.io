public class Pet {
    private String name;
    private int age;
 
    public Pet() {
       name = "Unnamed";
       age = -1;
    }
 
    public Pet(String petName) {
       name = petName;
       age = -1;
    }
 
    public Pet(String petName, int yearsOld) {
       name = petName;
       age = yearsOld;
    }
 
    public void print() {
       System.out.println(name + ", " + age);
    }
}
