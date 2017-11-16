package test2review;

import java.util.ArrayList;

public class TestGraphics2DShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPentagon pentagon1 = new RegularPentagon(1.0,2.0,8.0,7.0, "white",true,5.0);
		RegularPentagon pentagon2 = new RegularPentagon(100.0,200.0,12.0,10.0, "blue", true, 7.5);
		RegularPentagon pentagon3 = new RegularPentagon(300.0, 400.0, 18.0, 15.0,"yellow", true, 11.8);
		
		ArrayList<WhiteSpaceArea>list = new ArrayList<>();
		
		System.out.println(pentagon1);
		System.out.println(pentagon2);
		System.out.println(pentagon3);
		
		list.add(pentagon1);
		list.add(pentagon2);
		list.add(pentagon3);
		
		Graphics2DShapesUtility<WhiteSpaceArea> graphics2DShape = new Graphics2DShapesUtility<>(list,null);
	}

}
