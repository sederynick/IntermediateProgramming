package chapter20;

public class Rectangle implements Comparable<Rectangle> {
	private int x;
	private int y;
	private int height;
	private int width;

	public Rectangle(int x, int y, int height, int width) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	@Override
	public int compareTo(Rectangle rectangle) {
		// TODO Auto-generated method stub
		int area2 = rectangle.getHeight()* rectangle.getWidth();
		int area = height *width;

		if (area > area2)
			return 1;
		else if (area == area2)
			return 0;
		else
			return -1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + "]";
	}

}
