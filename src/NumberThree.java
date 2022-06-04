public class NumberThree {

    // 3.Calculate the value of the expression using the formula (all variables take real values):
    // infinuty - with the same numbers

    public double x, y;

    public double mathResult(double x, double y) {
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.cos(y)) * Math.tan(x * y);
        if (!Double.isInfinite(z)) {
            return z;
        } else {
            System.out.println("Enter 2 different numbers");
        }
        return z;
    }

    NumberThree() {
        System.out.println("Enter number 'a'");
        x = Util.scannerNum();
        System.out.println("Enter number 'b'");
        y = Util.scannerNum();
    }

    public static void main(String[] args) {

        NumberThree numberThree = new NumberThree();
        System.out.println(numberThree.mathResult(numberThree.x, numberThree.y));

    }
}
