public class Main {
    public static void main(String[] args) {
        System.out.println(Circle.getNumberCircles());
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(25);
        System.out.println(Circle.getNumberCircles());
        Circle circle3 = new Circle(125);
        System.out.println(Circle.getNumberCircles());


        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());
        System.out.println(circle1.getCircumference());
        System.out.println(circle2.getCircumference());
        System.out.println(circle3.getCircumference());
        circle1.setRadius(5);
        System.out.println(circle1.getArea());
        System.out.println(Circle.getNumberCircles());
    }
}
