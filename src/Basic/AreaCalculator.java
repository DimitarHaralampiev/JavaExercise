package Basic;

public class AreaCalculator {

    public static void main(String[] args){
        double circle = area(5.0);
        System.out.println(circle);
        double circleOne = area(-1);
        System.out.println(circleOne);

        double rect = area(5.0, 4.0);
        System.out.println(rect);
        double rectTwo = area(-1, 4.0);
        System.out.println(rectTwo);
    }

    public static double area(double radius){
        if (radius < 0){
            System.out.println("Invalid Value");
            return -1.0;
        } else {
            radius = Math.PI * radius * radius;
        }
        return radius;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            System.out.println("Invalid Value");
            return -1.0;
        }
        return x * y;
    }
}
