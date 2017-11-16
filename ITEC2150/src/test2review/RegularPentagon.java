package test2review;

public class RegularPentagon extends Graphics2DShape implements WhiteSpaceArea {
	
	private double lengthOfSide;
	
	

	public RegularPentagon(double x, double y, double width, double height, String color, boolean filled,
			double lengthOfSide) {
		super(x, y, width, height, color, filled);
		this.lengthOfSide = lengthOfSide;
	}
	


	@Override
	public String toString() {
		return super.toString() + "RegularPentagon [lengthOfSide=" + lengthOfSide + "]";
	}



	public double getLengthOfSide() {
		return lengthOfSide;
	}



	public void setLengthOfSide(double lengthOfSide) {
		this.lengthOfSide = lengthOfSide;
	}



	@Override
	public double getWhiteSpaceArea() {
		// TODO Auto-generated method stub
		double whiteSpaceArea = super.getAreaOfBoundingBox() - this.getAreaOf2DShape();
		return whiteSpaceArea;
	}

	@Override
	public double getAreaOf2DShape() {
		// TODO Auto-generated method stub
		double Area = 5.0 * Math.pow(lengthOfSide, 2)*Math.tan(Math.toRadians(54))/4.0;
		return Area;
	}

	@Override
	public double getPerimeterOf2DShape() {
		// TODO Auto-generated method stub
		double perimeter = 5.0 * lengthOfSide;
		return perimeter;
	}

}
