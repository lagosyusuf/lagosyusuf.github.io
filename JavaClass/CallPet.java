public class CallPet {
    public static void main(String[] args) {
        Pet dog = new Pet();
        Pet cat = new Pet("Bella");
        Pet bird = new Pet("Ruby", 9);
  
        bird.print();
        dog.print();
        cat.print();
     }
}
