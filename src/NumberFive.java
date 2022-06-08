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

    public int whatHour() {
        return secondsTotal / 3600;
    }

    public int whatMinutes() {
        return (secondsTotal % 3600) / 60;
    }

    public int whatSeconds() {
        return ((secondsTotal % 3600) % 60);
    }

    public static void main(String[] args) {

        NumberFive numberFive = new NumberFive();
        System.out.println("hh = " + numberFive.whatHour() + ";" + "mm = " + numberFive.whatMinutes()
                + ";" + "ss = " + numberFive.whatSeconds());

    }
}
