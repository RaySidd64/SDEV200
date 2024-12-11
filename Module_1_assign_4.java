public class Module_1_assign_4 {
    public static void main(String[] args) {
        // Create three RegularPolygon objects
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(4, 8);
        RegularPolygon regularPolygon3 = new RegularPolygon(6, 8, 10, 12);

        // Display perimeter and area of each object
        System.out.println("\n--------------------------------------------------");
        System.out.println("| Regular Polygon Objects |  Perimeter  |  Area  |");
        System.out.println("--------------------------------------------------");
        System.out.printf( "|       Object# 1         |%8.2f     |%6.2f  |\n",
                regularPolygon1.getPerimeter(), regularPolygon1.getArea());
        System.out.printf( "|       Object# 2         |%8.2f     |%6.2f  |\n",
                regularPolygon2.getPerimeter(), regularPolygon2.getArea());
        System.out.printf( "|       Object# 3         |%8.2f     |%6.2f  |\n",
                regularPolygon3.getPerimeter(), regularPolygon3.getArea());
        System.out.println("--------------------------------------------------");
    }
}