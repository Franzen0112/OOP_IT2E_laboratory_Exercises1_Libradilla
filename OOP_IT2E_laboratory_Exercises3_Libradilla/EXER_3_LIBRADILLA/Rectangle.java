public class Rectangle extends Shape {
    private final float length;
    private final float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    
    public float CalculateArea() {
        return length * width;
    }

   
    public float CalculatePerimeter() {
        return 2 * (length + width);
    }

    
    public String DisplayInfo() {
        return "Rectangle with length: " + length + ", width: " + width + 
               ", Area: " + CalculateArea() + ", Perimeter: " + CalculatePerimeter();
    }
}
	