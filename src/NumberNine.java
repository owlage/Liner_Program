public class NumberNine {

    //Three points A(x1,y1), B(x2,y2) and C(x3,y3) are given. Determine if they are on the same line.

    public double x1, y1, x2, y2, x3, y3;

    public NumberNine() {
        System.out.println("Enter point coordinates №1");
        x1 = Util.scannerDoubleNumber();
        y1 = Util.scannerDoubleNumber();
        System.out.println("Enter point coordinates №2");
        x2 = Util.scannerDoubleNumber();
        y2 = Util.scannerDoubleNumber();
        System.out.println("Enter point coordinates №3");
        x3 = Util.scannerDoubleNumber();
        y3 = Util.scannerDoubleNumber();
    }

    public void determinationOfCoordinates(double x1, double y1, double x2, double y2, double x3, double y3){
        if ((x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3)) {
            System.out.println("The points are on the same line");
        } else {
            System.out.println("Points do not lie on the same line");
        }
    }

    public static void main(String[] args) {

        NumberNine numberTen = new NumberNine();
        numberTen.determinationOfCoordinates(numberTen.x1, numberTen.y1, numberTen.x2, numberTen.y2, numberTen.x3, numberTen.y3);



    }
}
