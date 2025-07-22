public class Circle {
    private double radius;
    private static int numberCircles = 0;

    public Circle() {
        numberCircles++;
    }

    public Circle(double newRadius){
        radius = newRadius;
        numberCircles++;
    }

    public void setRadius(double newRadius) {
        if(newRadius > 0){
            radius = newRadius;
        }
        else{
            System.out.println("can't");
        }
    }
    public double getRadius() {
        return radius;
    }
    public static int getNumberCircles(){
        return numberCircles;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
