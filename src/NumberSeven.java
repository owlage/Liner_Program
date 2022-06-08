public class NumberSeven {

    /*
     7.Two angles of a triangle are given (in degrees). Determine if such a triangle exists
     and if so, will it be rectangular.
     */

    public double angleA, angleB;

    public void triangleСheck(){
        if (angleA + angleB <= 180) {
            System.out.println("Triangle exists");
            if (angleA == 90 || angleB == 90 || (angleA + angleB) == 90) {
                System.out.println("Triangle rectangular");
            }
        } else {
            System.out.println("The triangle doesn't exist");
        }
    }

    public static void main(String[] args) {

        NumberSeven numberSeven = new NumberSeven();

        System.out.println("Enter 2 angles with enter, the angle cannot be less than 1 and greater than 179!");
        numberSeven.angleA = Util.angleInput();
        numberSeven.angleB = Util.angleInput();
        numberSeven.triangleСheck();

    }
}
