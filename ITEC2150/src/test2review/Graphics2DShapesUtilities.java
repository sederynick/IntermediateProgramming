package test2review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Graphics2DShapesUtilities<E> {
	private ArrayList<E> list;
	private File filePathAndName;
	public Graphics2DShapesUtilities(){
		list= new ArrayList<E>();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JTextField textField = new JTextField(10);
		JLabel label = new JLabel();
		frame.setSize(250,150);
		button1.setSize(150, 30);
		button2.setSize(150, 30);
		
	}
	public double totalWhiteSpaceArea(double[] array, int lengthOfArray) {
		if(lengthOfArray==0)
			return lengthOfArray;
		else
			return lengthOfArray + totalWhiteSpaceArea(array,lengthOfArray);
	}
	public void totalWhiteSpaceAreaHelper(ArrayList<E> list){
		double[] temp = new double[list.size()];
		for(int i=0;i<list.size();i++) {
			temp[i] = (double)((RegularPentagon)list.get(i)).getWhiteSpaceArea();
		}
		return;
	}
	public void writeGraphics2DShapesToFile(ArrayList<E> list) {
		try {
			PrintWriter print = new PrintWriter(filePathAndName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("FileNotFoundException Handled");
		}
	}
}
