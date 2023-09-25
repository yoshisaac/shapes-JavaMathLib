package shapes;

public class Rectangle
{
    private double length;
    private double width;

    public Rectangle() {
	length = 1.0;
	width = 1.0;
    }

    public Rectangle(double len) {
	length = len;
	width = len;
    }

    public Rectangle(double len, double wid) {
	length = len;
	width = wid;
    }

    public double getArea()
    {
	return length * width;
    }

    public double getLength()
    {
	return length;
    }

    public double getPerimeter()
    {
	return length + length + width + width;
    }

    public double getWidth()
    {
	return width;
    }

    public void setLength(double len)
    {
	length = len;
    }

    public void setWidth(double wid)
    {
	width = wid;
    }

    @Override
    public String toString() {
	return "rectangle with length " + length + ", width " + width;
    }
    
}
