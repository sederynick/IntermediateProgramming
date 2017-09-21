package test1;

public class HexagonalPrism extends RegularHexagon {

	private double height;
	
	public HexagonalPrism() {
		this.height=1.0;
		
		
	}

	public HexagonalPrism(double height) {
		this.height=height;
		
	}

	public HexagonalPrism(double height, double side, String color, boolean filled) {
		super(side,color,filled);
		this.height=height;
		
		
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume(){
		return getArea()*height;
	}
	
	@Override
	public String toString() {
		return "HexagonalPrism [height=" + height + ", toString()=" + super.toString() + "]";
	}
	
	

}
