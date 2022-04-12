public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        radius = 10;
    }
    public Circle(double r, String c, boolean f){
        super(c,f);
        radius = r;
    }
    public double getRadius(){return radius;}

    public void setRadius(double r){radius = r;}

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){return Math.PI * 2 * radius;}

    public double getDiameter(){return 2 * radius;}


    public String toString() {
        return "Circle has a radius of " + radius + "\n" + super.toString();
    }
}