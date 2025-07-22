public class Rectangle {
    private double width = 1;
    private double height = 1;

    public Rectangle(){}
    public Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return width*2+height*2;
    }
}

