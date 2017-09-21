package test1review;

import java.util.ArrayList;
import java.util.Scanner;

public class TestTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side one of the triangle:");
		double side1 = input.nextDouble();
		System.out.println("Enter side two of the triangle:");
		double side2 = input.nextDouble();
		System.out.println("Enter side three of the triangle:");
		double side3 = input.nextDouble();
		Triangle triangle = new Triangle(side1, side2, side3);
		input.nextLine();
		System.out.println("Enter color of the triangle:");
		String color = input.nextLine();
		triangle.setColor(color);
		System.out.println("Is the Triangle filled? Reply with 'true' or 'false':");
		boolean filled = input.nextBoolean();
		triangle.setFilled(filled);
		input.close();
		System.out.println();
		
		System.out.println(triangle);
		System.out.printf("Area is %.2f\n", triangle.getArea());
		System.out.printf("Perimeter is %.2f\n", triangle.getPerimeter());
		System.out.println();
		
		GeometricObject geometricObject = new GeometricObject("green", true);
		System.out.println(geometricObject);
		System.out.println();
		
		Triangle triangle2 = new Triangle("black", true, 2.0, 4.0, 5.0);
		System.out.println(triangle2);
		System.out.printf("Area is %.2f\n", triangle2.getArea());
		System.out.printf("Perimeter is %.2f\n", triangle2.getPerimeter());
		System.out.println();
		
		ArrayList <GeometricObject> objectList = new ArrayList <GeometricObject> ();
		objectList.add(triangle);
		objectList.add(triangle2);
		objectList.add(geometricObject);
		System.out.println(objectList);
		System.out.println();

		for (int i = 0; i < objectList.size(); i++){
			if (objectList.get(i).getColor().equals("black"))
				objectList.get(i).setColor("blue");
		}
		System.out.println(objectList);
		System.out.println();
		
		objectList.remove (geometricObject);
		System.out.println(objectList);
		System.out.println();
		
		objectList.clear();
		System.out.println(objectList);
	}

}
