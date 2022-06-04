import java.util.Scanner;

public class Util {

    static Scanner scanner = new Scanner(System.in);
    static int numOne;
    static double numDoub;

    public static int scannerNum() {
        if (scanner.hasNextInt()) {
            numOne = scanner.nextInt();
            if (numOne < 1) {
                System.out.println("Please enter a number greater than zero");
                scannerNum();
            }
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerNum();
        }
        return numOne;
    }

    public static double scannerDoub() {
        if (scanner.hasNextDouble()) {
            numDoub = scanner.nextDouble();
            if (numDoub < 1) {
                System.out.println("Please enter a number greater than zero");
                scannerDoub();
            }
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerDoub();
        }
        return numDoub;
    }
}
