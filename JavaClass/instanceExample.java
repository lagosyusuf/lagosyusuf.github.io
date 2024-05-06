public class instanceExample {
    public static void main(String[] args) {
        int num = 5;
        Integer numObj = new Integer(num);
        System.out.println(num);
        System.out.println(numObj instanceof Integer);
    }
}