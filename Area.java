import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String room = scanner.nextLine();
        
        switch (room) {
            case "rectangle":
                double width = scanner.nextDouble();
                double length = scanner.nextDouble();
                System.out.println(areaOfRectangle(width, length));
                break;
            case "circle":
                double radius = scanner.nextDouble();
                System.out.println(areaOfCircle(radius));
                break;
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(areaOfTriangle(a, b, c));
                break;
            default:
                break;
        }
    }
    
    public static double areaOfRectangle(double width, double length) {
        return width * length;
    }
    public static double areaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }
    public static double areaOfTriangle(double a, double b, double c) {
        double s = (a+b+c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}