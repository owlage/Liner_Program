public class NumberFive {

    /*
     5. Given a natural number T, which represents the duration of the elapsed time in seconds. Output the given value
     duration in hours, minutes and seconds in the following form:
     */

    public int secondsTotal;

    public NumberFive() {
        System.out.println("Enter the number of seconds in digits, the number must be an integer!");
        secondsTotal = Util.scannerNumber();
    }

    public int whatHour(int secondsTotal) {
        return secondsTotal / 3600;
    }

    public int whatMinutes(int secondsTotal) {
        return (secondsTotal % 3600) / 60;
    }

    public int whatSeconds(int secondsTotal) {
        return ((secondsTotal % 3600) % 60);
    }

    public static void main(String[] args) {

        NumberFive numberFive = new NumberFive();
        System.out.println("hh = " + numberFive.whatHour(numberFive.secondsTotal) + ";" +
                "mm = " + numberFive.whatMinutes(numberFive.secondsTotal)
                + ";" + "ss = " + numberFive.whatSeconds(numberFive.secondsTotal));

    }
}
