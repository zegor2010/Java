public class Circle {
    double radius;

    public Circle() {}

    public Circle(double newRadius){
        radius = newRadius;
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}
