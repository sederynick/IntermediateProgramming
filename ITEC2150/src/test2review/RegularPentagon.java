package test2review;

public class RegularPentagon extends Graphics2DShape implements WhiteSpaceArea {
	
	private double side;

	public RegularPentagon(double x, double y, double width, double height, 
			String color, boolean filled,double side) {
		super(x, y, width, height, color, filled);
		side=this.side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "RegularPentagon [length=" + side + ", toString()=" + super.toString() + "]";
	}
	@Override
	public double getWhiteSpaceArea() {
		double whiteSpaceArea=super.getAreaOfBoundingBox() - this.getAreaOf2DShape();
		return whiteSpaceArea;
	}

	@Override
	public double getAreaOf2DShape() {
		return 5.0 * Math.pow(side, 2.0) * Math.tan(Math.toRadians(54))/4.0;
	}

	@Override
	public double getPerimeterOf2DShape() {
		return 5.0 * side;
	}
}