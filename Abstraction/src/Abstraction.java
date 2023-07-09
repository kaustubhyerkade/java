
public class Abstraction 
{
    		
	
	
}


///////////////////////


abstract class Shape 
{

	String color;

	abstract double area();
	public abstract String toString();

	public Shape(String color)
	{
		//super();
		System.out.println("Shape cons called");
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}

class Circle extends Shape
{
	double radious;

	public Circle(String color, double radious) {
		super(color);
		this.radious = radious;
	}

	double area()
	{

		return Math.PI* Math.pow(radious, 2);
	}

	double String toString()
	{
		System.out.println("Color is "+super.color +" Area is"+area());
	}

}


class Rectangle extends Shape
{
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
     
    double area()
    {
    	return length*width;
    }
    
    double String toString()
    {
     return "Rectangle color is "+super.color+" area is "+area(); 
    }	 

}

public class Test
{
	public static void main(String args[])
	{
		Shape s1=new Circle("Yellow",4);
		Shape s2=new Rectangle("Blue",4,5);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}