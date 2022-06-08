public class NumberEleven {

    /*
    The dimensions A, B of the rectangular hole and the dimensions x, y, z of the brick are given.
    Determine if the brick will go through the hole.
     */

    public double brickLength, brickWidth, brickDepth, holeLength, holeWidth;

    public NumberEleven() {
        System.out.println("Enter Hole Drills");
        System.out.println("Length");
        holeLength = Util.scannerDoubleNumber();
        System.out.println("Width");
        holeWidth = Util.scannerDoubleNumber();
        System.out.println("Enter brick dimensions");
        System.out.println("Length");
        brickLength = Util.scannerDoubleNumber();
        System.out.println("Width");
        brickWidth = Util.scannerDoubleNumber();
        System.out.println("Depth");
        brickDepth = Util.scannerDoubleNumber();
    }

    public void brigGoIn(){
        if (holeLength >= brickLength && holeWidth >= brickWidth || holeLength >= brickWidth && holeWidth >= brickLength ||
                holeLength >= brickLength && holeWidth >= brickDepth || holeLength >= brickDepth && holeWidth >= brickLength ||
                holeLength >= brickWidth && holeWidth >= brickDepth || holeLength >= brickDepth && holeWidth >= brickWidth) {
            System.out.println("Brick will pass");
        } else {
            System.out.println("Brick won't pass");
        }
    }

    public static void main(String[] args) {

        NumberEleven numberEleven = new NumberEleven();
        numberEleven.brigGoIn();

    }
}
