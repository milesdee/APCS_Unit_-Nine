public class Triangle extends Shape{
    private double side1, side2, side3;

    public Triangle(){
        //optional first line: super();
        side1 = 2.0;
        side2 = 2.0;
        side3 = 2.0;
    }



    public Triangle(double s1, double s2, double s3, String c, boolean f) {
        super(c,f);
        side1 = s1;
        side2 = s2;
        side3 = s3;
        //setColor(c);
        //setFilled(f);
    }
    public double getSide1(){return side1;}

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "The triangle has sides of " + side1 + ", " + side2 + ", and " + side3 +"\n" + super.toString();
    }
}