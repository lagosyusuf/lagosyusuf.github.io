import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store employee records
        Map<String, Integer> employeeMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        employeeMap.put("John", 35);
        employeeMap.put("Alice", 27);
        employeeMap.put("Bob", 42);

        // Retrieve values based on keys
        int johnAge = employeeMap.get("John");
        System.out.println("John's age: " + johnAge);

        // Update a value
        employeeMap.put("Alice", 28);

        // Iterate over the HashMap
        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " is " + age + " years old.");
        }
    }
}