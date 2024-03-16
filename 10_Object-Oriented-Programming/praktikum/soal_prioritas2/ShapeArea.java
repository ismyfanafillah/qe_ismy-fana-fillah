public class ShapeArea {
    // Calculate the area of a square
    public static int getSquareArea(int side) {
        return side * side;
    }

    // Calculate the area of a rectangle
    public static int getRectangleArea(int length, int width) {
        return length * width;
    }

    // Calculate the area of a circle
    public static double getCircleArea(int radius) {
        return 3.14 * radius * radius;
    }

    // Calculate the area of a trapezoid
    public static int getTrapezoidArea(int base1, int base2, int height) {
        return (base1 + base2) * height / 2;
    }

    public static void main(String[] args) {
        // Calculate input values and print the areas
        System.out.println("luas persegi: " + ShapeArea.getSquareArea(12));
        System.out.println("luas persegi panjang: " + ShapeArea.getRectangleArea(7,8));
        System.out.println(String.format("luas lingkaran: %.2f", ShapeArea.getCircleArea(21)));
        System.out.println("luas trapesium: " + ShapeArea.getTrapezoidArea(5, 6, 2));
    }
}
