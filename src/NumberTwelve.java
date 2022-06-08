public class NumberTwelve {

    //Calculate function value:

    public double x;

    public NumberTwelve() {
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

        NumberTwelve numberTwelve = new NumberTwelve();
        System.out.println(numberTwelve.functionDefinition(numberTwelve.x));
    }
}
