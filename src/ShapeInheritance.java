import java.util.ArrayList;
public class ShapeInheritance extends Shape {
    public static void main(String[] args){
        Circle circ = new Circle(10, "blue", true);
        Rectangle rect = new Rectangle(5,5, "pink", true);
        Triangle tree = new Triangle(4,4,4, "green", true);
        ArrayList <Shape> shapes  = new ArrayList<Shape>();
        shapes.add(circ);
        shapes.add(rect);
        shapes.add(tree);
        for (Shape i: shapes){
            System.out.println(i.getArea());
        }
    }
}