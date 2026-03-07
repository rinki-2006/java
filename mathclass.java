public class mathclass {
    public static void main(String[] args) {
        System.out.println("Absolute = " + Math.abs(-123));

        System.out.println("Absolute = " + StrictMath.abs(-123));

        System.out.println("cube root = " + Math.cbrt(64));

        System.out.println("Exact decrement = " + Math.decrementExact(9));

        System.out.println("Exponent value = " + Math.getExponent(289.987));

        System.out.println("Round Division = " + Math.floorDiv(25,6));

        System.out.println("e power x = " + Math.exp(2));
        System.out.println("e power x = " + StrictMath.exp(2));

        System.out.println("Log base 10 = " + Math.log10(100));

        System.out.println("Maximum = " + Math.max(100,567));
        System.out.println("Minimum = " + Math.min(100, 567));

        System.out.println("Tan = " + Math.tan(45));  // give radian
        System.out.println("Tan = " + Math.tan(45 * Math.PI/180));  // convert radian to degree

        System.out.println("Convert to radian = " + Math.toRadians(90));

        System.out.println("Convert to degree = " + Math.toDegrees(Math.atan(1)));

        System.out.println("Convert to degree = " + Math.toDegrees(Math.tanh(1)));

        System.out.println("Random = " + Math.random()*100);

        System.out.println("Power = " + Math.pow(4,3));

        System.out.println("Exact Product = " + Math.multiplyExact(1689, 100));

        System.out.println("Next float Value = " + Math.nextAfter(12.6, 13));
        System.out.println("Next float Value = " + Math.nextAfter(12.6, 11));
    }
}
