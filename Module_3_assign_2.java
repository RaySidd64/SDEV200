import java.math.BigInteger;

public class Module_3_assign_2 {
    public static void main(String[] args) {
        Rational r1 = new Rational(new BigInteger("400000"),
                new BigInteger("200000"));
        Rational r2 = new Rational(new BigInteger("200000"),
                new BigInteger("300000"));
        
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}