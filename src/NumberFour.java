public class NumberFour {

    //four. Given a real number R of the form nnn.ddd (three digits in the fractional and integer parts). Swap the fractional and
    // integer part of the number and output the resulting value of the number.

    double r;

    public double numberR(double r) {
        return (r * 1000) % 1000 + (int) r / 1000.0;
    }

    public void numberEntry() {
        System.out.println("Enter a fractional number");
        r = Util.scannerDoub();
    }

    public static void main(String[] args) {

        NumberFour numberFour = new NumberFour();
        numberFour.numberEntry();
        System.out.println(numberFour.numberR(numberFour.r));

    }
}
