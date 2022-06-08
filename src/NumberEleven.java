public class NumberEleven {

    //Calculate function value:

    public double x;

    public NumberEleven() {
        x = Util.scannerDoubleNumber();
    }

    public double functionDefinition(double x){
        if(x <= 3){
            return x * x - 3 * x + 9;
        }
        else {
            return  1 / (Math.pow(x, 3) + 6);
        }
    }

    public static void main(String[] args) {

        NumberEleven numberTwelve = new NumberEleven();
        System.out.println(numberTwelve.functionDefinition(numberTwelve.x));
    }
}
