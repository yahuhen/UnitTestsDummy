public class EvenOddChecker {
    public static void main(String[] args) {
        check(5);
    }

    public static boolean check(int num) {

        System.out.println("Enter an Integer number:");

        if (num % 2 == 0) {
            System.out.println("Entered number is even");
            return true;

        } else {
            System.out.println("Entered number is odd");
            return false;
        }
    }

}
