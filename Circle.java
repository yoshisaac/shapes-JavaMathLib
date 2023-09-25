package shapes;

public class Circle
{
    private double radius;
    
    public Circle() {
	radius = 1.0;
    }

    public Circle(double num) {
	radius = num;
    }

    public  double getArea()
    {
	return Math.PI * (radius * radius);
    }

    public  double getCircumference()
    {
	return 2 * Math.PI * radius;
    }

    public  double getRadius()
    {
	return radius;
    }

    public  void setRadius(double num)
    {
	radius = num;
    }

    @Override
    public String toString() {
	return "circle with radius " + radius;
    }
    
}
