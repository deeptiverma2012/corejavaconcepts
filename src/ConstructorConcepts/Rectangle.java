package ConstructorConcepts;

public class Rectangle {
	
	double length;
	double width;
	
	public Rectangle()
	{
		
		this(0, 0);
		this.areaOfRectangle(0, 0);
	}
	public Rectangle( double length, double width)
	{
		this.length = length;
		this.width = width;
		this.areaOfRectangle(length, width);
		
	}
	public double areaOfRectangle( double length, double width)
	{
		double area = length*width;
		System.out.println("Area of the rectangle is:"+area);
		return area;
	}

}
