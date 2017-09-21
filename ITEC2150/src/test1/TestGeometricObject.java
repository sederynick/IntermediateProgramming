package test1;

import java.util.ArrayList;

public class TestGeometricObject {

	public static void main(String[] args) {
	RegularHexagon regularhexagon = new RegularHexagon(2.0,"grey",true);
	System.out.println(regularhexagon);
	System.out.println(regularhexagon.getArea());
	System.out.println(regularhexagon.getPerimeter());
	HexagonalPrism hexagonalprism = new HexagonalPrism(10.0,3.0, "orange", true);
	System.out.println(hexagonalprism);
	System.out.println(hexagonalprism.getVolume());
	
	ArrayList <RegularHexagon> objectList = new ArrayList <RegularHexagon> ();
	objectList.add(regularhexagon);
	objectList.add(hexagonalprism);
	System.out.println(objectList);
	
	}

}
