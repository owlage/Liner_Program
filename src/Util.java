import java.util.Scanner;

public class Util {

    static int numOne;
    static double numDoubOne;

    public static int scannerNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than zero");
        if (scanner.hasNextInt()) {
            numOne = scanner.nextInt();
            if (numOne < 1) {
                System.out.println("Please enter a number greater than zero");
                scannerNumber();
            }
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerNumber();
        }
        scanner.close();
        return numOne;
    }

    public static double scannerDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number greater than zero");
        if (scanner.hasNextDouble()) {
            numDoubOne = scanner.nextDouble();
            if (numDoubOne < 1) {
                System.out.println("Please enter a number greater than zero");
                scannerDoubleNumber();
            }
        } else {
            System.out.println("Please enter a number greater than zero or you have entered a number greater than 2147483647");
            scannerDoubleNumber();
        }
        scanner.close();
        return numDoubOne;
    }

    public static double angleInput() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            numDoubOne = scanner.nextDouble();
                if (numDoubOne < 1 || numDoubOne >= 180) {
                    System.out.println("Enter any number from 1 to 179");
                    angleInput();
                }
            } else {
                System.out.println("Enter any number from 1 to 179");
                angleInput();
            }
        scanner.close();
        return  numDoubOne;
    }
}
