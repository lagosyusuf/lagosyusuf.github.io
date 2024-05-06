import java.util.Scanner;


public class wages{
    public static void main(String[] args) {
        int wage;

        Scanner sc = new Scanner(System.in);
        wage = sc.nextInt();

        System.out.println("Salary is: " + (wage *40 *50 ));
    }
}