public class NumberSix {

    /*
        6. For a given area, a linear program has been compiled that prints true if points with coordinates (x, y)
        belongs to the filled area, and false if:
     */

    public double x,y;

    public NumberSix() {
        System.out.println("Enter coordinate: x");
        x = Util.scannerDoubleNumber();
        System.out.println("Enter coordinate: y");
        y = Util.scannerDoubleNumber();
    }

    public void coordinateCalculation(){
        if (x > -5.0 & x < -3.0 || x < 5.0 & x > 2.0) {
            if (y <= 0.0 && y > -4.0) {
                System.out.println("true");
            } else
                System.out.println("false");
        } else if (x >= -2.0 & x <= 2.0) {
            if (y >= -3.0 & y < 5.0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {

        NumberSix numberSix = new NumberSix();
        numberSix.coordinateCalculation();

    }
}
