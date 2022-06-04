public class NumberOne {

    // 1.Find the value of a function: z = ( (a – 3 ) * b / 2) + c.

    int a, b, c;

    public double mathResult(int a, int b, int c) {
        return (((double) a - 3) * (double) b / 2) + (double) c;
    }

    public static void main(String[] args) {

        NumberOne numberOne = new NumberOne();

        System.out.println("Enter number 'a'");
        numberOne.a = Util.scannerNum();
        System.out.println("Enter number 'b'");
        numberOne.b = Util.scannerNum();
        System.out.println("Enter number 'c'");
        numberOne.c = Util.scannerNum();

        System.out.println(numberOne.mathResult(numberOne.a, numberOne.b, numberOne.c));
    }
}
