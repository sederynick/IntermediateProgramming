package test1review;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	private double area;
	private double perimeter;
	private double s;
	
	public Triangle(double side1,double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public Triangle(String color, boolean filled,double side1,
			double side2, double side3) {
		super(color,filled);
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public Triangle(){
		this(1.0,1.0,1.0);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	

	public double getArea() {
		s=(side1+side2+side3)/2;
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		perimeter=side1+side2+side3;
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + 
				", side3=" + side3 + ", " + super.toString()
				+ "]";
	}


}
