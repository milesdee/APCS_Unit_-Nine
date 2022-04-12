public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(){
        super();
        width = 5;
        height = 10;
    }


    public Rectangle(double w, double h, String c, boolean f){
        super(c,f);
        width = w;
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w){width = w;}

    public void setHeight(double h){height = h;}

    public double getArea(){return width*height;}

    public double getPerimeter(){return (width*2) + (height*2);}

    public String toString() {
        return "Rectangle has width of " + width + " and height of " + height + "\n" + super.toString();

    }
}