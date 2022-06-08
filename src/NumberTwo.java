public class NumberTwo {

    //2.Calculate the value of an expression using a formula (all variables take real values):

    public double a, b, c;

    public double mathResult(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c) / 2) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {

        NumberTwo numberTwo = new NumberTwo();

        System.out.println("Enter number 'a'");
        numberTwo.a = Util.scannerDoubleNumber();
        System.out.println("Enter number 'b'");
        numberTwo.b = Util.scannerDoubleNumber();
        System.out.println("Enter number 'c'");
        numberTwo.c = Util.scannerDoubleNumber();

        System.out.println(numberTwo.mathResult(numberTwo.a, numberTwo.b, numberTwo.c));
    }
}
