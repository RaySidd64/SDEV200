public class Module_2_assign_3 {

    public static void main(String[] args) {

        System.out.println(bin2Dec("110101010"));
        // Throwing an exception on purpose
        System.out.println(bin2Dec("RayyanS"));
    }

    public static int bin2Dec(String binary) throws BinaryFormatException {

        if (!isBinary(binary)) {
            throw new BinaryFormatException(binary + " is not a binary number.");
        }
        int power = 0;
        int decimal = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {

            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static boolean isBinary(String binary) {

        for (char ch : binary.toCharArray()) {
            if (ch != '1' && ch != '0') return false;
        }
        return true;
    }

}

class BinaryFormatException extends IllegalArgumentException {

    BinaryFormatException(String s) {
        super(s);
    }
}