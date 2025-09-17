public class ShapeTester{
    public static void main(String[] args) {
        
        Shape circle = new Circle(2.0f);
        System.out.println(circle.DisplayInfo());  

        Shape rectangle = new Rectangle(9.0f, 6.0f);
        System.out.println(rectangle.DisplayInfo());

        Shape square = new Square(3.0f);
        System.out.println(square.DisplayInfo());

        Shape triangle = new Triangle(5.0f, 5.0f, 2.0f);
        System.out.println(triangle.DisplayInfo());

    }
}