public class Module_3_assign_1 {

    public static void main(String[] args) {
        Circle circle1 = new Circle(1, "red", true);
        Circle circle2 = new Circle(2, "blue", true);
        Circle circle3 = new Circle(1, "red", true);

        System.out.println("Circle1 radius: " + circle1.getRadius());
        System.out.println("Circle2 radius: " + circle2.getRadius());
        System.out.println("Circle3 radius: " + circle3.getRadius());

        System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") +
                "equal to circle2");

        System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") +
                "equal to circle3");
    }
}