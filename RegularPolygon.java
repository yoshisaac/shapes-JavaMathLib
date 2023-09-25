package shapes;

public class RegularPolygon
{
    private double length;
    private int sides;

    public RegularPolygon() {
	length = 1.0;
	sides = 3;
    }

    public RegularPolygon(double len) {
	length = len;
	sides = 3;
    }

    public RegularPolygon(int num) {
	length = 1.0;
	sides = num;
    }

    public RegularPolygon(int num, double len) {
	length = len;
	sides = num;
    }

    public void addSides()
    {
	sides += 1;
    }

    public void addSides(int numExtra)
    {
	sides += numExtra;
    }

    public double getArea()
    {
	switch (sides)
	{
	case 3:
	    return 0.5 * (length * length);
	    
	case 4:
	    return length * length;

	case 5:
	    return 0.5 * (length * sides) * ( length / (Math.tan(Math.toRadians(180/sides))) );

	case 6:
	    return ((3*Math.sqrt(3))/2) * (length * length);

	case 7:
	    return (sides * (length * length))/(4*Math.tan(Math.PI/sides));

	case 8:
	    return (2*(1+Math.sqrt(2))) * (length*length);

	default:
	    return 0;
	}
    }

    public int getNumSides()
    {
	return sides;
    }

    public double getPerimeter()
    {
	return length * sides;
    }

    public double getSideLength()
    {
	return length;
    }

    public void setNumSides(int num)
    {
	sides = num;
    }

    public void setSideLength(double len)
    {
	length = len;
    }

    @Override
    public String toString() {
	switch (sides)
	{
	case 3:
	    return "equilateral triangle with side length " + length;

	case 4:
	    return "square with side length " + length;

	case 5:
	    return "regular pentagon with side length " + length;

	case 6:
	    return "regular hexagon with side length " + length;

	case 7:
	    return "regular heptagon with side length " + length;

	case 8:
	    return "regular octogon with side length " + length;

	case 9:
	    return "regular nonagon with side length " + length;

	case 10:
	    return "regular decagon with side length " + length;

	case 11:
	    return "regular hendegon with side length " + length;

	case 12:
	    return "regular dodecagon with side length " + length;

	case 13:
	    return "regular triskaidecagon with side length " + length;

	case 14:
	    return "regular tetrakaidecagon with side length " + length;

	case 15:
	    return "regular pentadecagon with side length " + length;

	case 16:
	    return "regular hexadecagon with side length " + length;

	case 17:
	    return "regular heptadecagon with side length " + length;

	case 18:
	    return "regular octadecagon with side lenth " + length;

	case 19:
	    return "regular enneadecagon with side length " + length;

	case 20:
	    return "regular icosagon with side length " + length;

	default:
	    return "regular polygon of " + sides  + " sides with side length " + length;
	}
    }
    
}
