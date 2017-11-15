package test2review;

public abstract class Graphics2DShape {
	//The x and y coordinates of the upper left corner of the bounding box
	private double x;
	private double y;
	
	//The width and y coordinates of the upper left corner of the bounding box
	private double width;
	private double height;
	
	//Instance variables to indicate the color of the 2D shape and whether it is filled 
	private String color;
	private boolean filled;
	
	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param color
	 * @param filled
	 */
	public Graphics2DShape(double x, double y, double width, double height, String color,
			boolean filled){
		this.setX(x);
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		this.filled = filled;
		
	}
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the filled
	 */
	public boolean isFilled() {
		return filled;
	}
	/**
	 * @param filled the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GraphicsShape [x=" + x + ", y=" + y + ", width=" + width 
				+ ", height=" + height + ", color=" + color
				+ ", filled=" + filled + "]";
	}
	/**
	 * Method: getAreaOfBoundingBox
	 * Calculate the area of the bounding box from its width and height
	 * @return the area of the bounding box
	 */
	public double getAreaOfBoundingBox(){
		return width * height;
	}
	/**
	 * Method: getPerimeterOfBoundingBox
	 * Calculate the perimeter of the bounding box from its width and height
	 * @return the perimeter of the bounding box
	 */
	public double getPerimeterOfBoundingBox(){
		return 2 * (width * height);
	}
	/**
	 * Method: getAreaOf2DShape
	 * Calculate the area of the 2D shape
	 */
	public abstract double getAreaOf2DShape();
	/**
	 * Method: getPerimeterOf2DShape
	 * Calculate the perimeter of the 2D shape
	 */
	public abstract double getPerimeterOf2DShape();
	
}
