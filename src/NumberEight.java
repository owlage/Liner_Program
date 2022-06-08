public class NumberEight {

    /*
    8. Find max{min(a, b), min(c, d)}.
     */

    public double numberA, numberB, numberC, numberD;

    public double maxSearchValue(double numberA, double numberB, double numberC, double numberD){
        return Math.max(Math.min(numberA, numberB), Math.min(numberC, numberD));
    }

    public static void main(String[] args) {

        NumberEight numberEight = new NumberEight();
        numberEight.numberA = Util.scannerDoubleNumber();
        numberEight.numberB = Util.scannerDoubleNumber();
        numberEight.numberC = Util.scannerDoubleNumber();
        numberEight.numberD = Util.scannerDoubleNumber();

        System.out.println("Max value = " + numberEight.maxSearchValue(numberEight.numberA, numberEight.numberB,
                numberEight.numberC, numberEight.numberD));
    }
}
