package base;


public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println(fakeBin("645453"));
    }

    /**
     * FakeBinary.
     * Given a string of digits, you should replace any digit below 5 with '0' and
     * any digit 5 and above with '1'.
     * Return the resulting string.
     */

    static String fakeBin(String numberString) {


        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}