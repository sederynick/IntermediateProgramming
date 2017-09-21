package test1;

public class RegularHexagon extends GeometricObject {
	
	private double side;
	
	public RegularHexagon() {
		this.side=1.0;
	}
	
	public RegularHexagon(double side) {
		this.side=side;
	}

	public RegularHexagon(double side, String color, boolean filled) {
		super(color, filled);
		this.side=side;
		
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea(){
		return 1.5 * Math.sqrt(3.0) * side * side;
	}
	
	public double getPerimeter(){
		return side*6;
	}

	@Override
	public String toString() {
		return "RegularHexagon [side=" + side + ", toString()=" + super.toString() + "]";
	}
	
	

}
