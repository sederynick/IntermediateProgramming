package chapter20;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawGraph extends JPanel implements ActionListener {

	//	Add an ArrayList of String, and LinkedList and PriorityQueue of ComparefileSize objects as instance variables in 
	//	DrawGraph and create them in the constructor below the previous LinkedList and PriorityQueue
	private ArrayList<String> array;
	private LinkedList<CompareFileSize> linked;
	private PriorityQueue<CompareFileSize> priority;

	private LinkedList<Rectangle> list;
	private PriorityQueue<Rectangle> queue;
	private JFrame frame;
	private JPanel panel;
	private JPanel panel1;
	private JButton button;

	public DrawGraph(){
		//Constructs an empty linked list
		list = new LinkedList <Rectangle> ();
		//Constructs a priority queue with the default capacity of 11
		queue = new PriorityQueue <Rectangle> ();

		array = new ArrayList<String>();
		linked = new LinkedList<CompareFileSize>();
		priority = new PriorityQueue<CompareFileSize>();

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Type in the name of your files.");
			String a = input.next();
			array.add(a);
		}

		for (int i = 0; i < 5; i++) {
			String fileName = array.get(i);
			File filePath = new File(System.getProperty("user.home") + File.separatorChar + "Desktop" 
					+ File.separatorChar + "TextIO"
					+ File.separatorChar + fileName);
			CompareFileSize c = new CompareFileSize(filePath);
			linked.add(c);
		}

		CompareFileSize c = new CompareFileSize(null);
		//Create the drawing canvas using Jframe
		//Create the button called Sort by File Size
		frame= new JFrame("Nothing");
		button= new JButton("Sort by Size");
		//Add the following code
		panel = new JPanel(new BorderLayout());
		panel1 = new JPanel();
		panel1.add(button);
		panel1.setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		panel.add(this);
		panel.add(panel1, BorderLayout.SOUTH);
		frame.add(panel);
		//Set the frame size to 700 X 300
		frame.setSize(700, 300);
		//set Default Close Operation to EXIT_ON_CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//the window should be made visible
		frame.setVisible(true);
		//the window should not be resizeable
		frame.setResizable(false);
		//add this object to the button as an action listener
		button.addActionListener(this);
		//Call the following method to create Rectangle objects. We will implement the method next
		makeRectangles();
	}

	public void makeRectangles(){
		//Create 5 Rectangles
		for(int i = 0; i < 5; i++){
			//Create a Rectangle with random height and //width 50. Add it to the end of the list.
			//The x-coordinate of the upper left corner of //the Rectangles depends upon the value of i //and has the effect of positioning the next //Rectangle to the right of the previous one.
			//The y-coordinate and height are random to simulate //different file sizes. You will use actual file sizes when //enhancing the program. The width is always 50 to //keep the width of the graph’s bar constant
			//int rand = (int)(Math.random()*130) + 10;
			//list.addLast(new Rectangle((i+1)*100+10, 170-rand, rand, 50));

			CompareFileSize c = linked.get(i);

			list.addLast(new Rectangle((i+1)*100+10, 170-(int) (c.getFile().length()/1024.0*20.0), (int) (c.getFile().length()/1024.0*20.0), 50));
			
		}
	}

	//Overrides paintComponent(Graphics g) in the super class to draw the graph
	public void paintComponent(Graphics g){
		//Calls paintComponent(Graphics g) from the super class to clear the canvas
		super.paintComponent(g);
		//Remove each Rectangle from the list and draw it
		for(int i = 0; i < list.size(); i++){
			Rectangle r = list.get(i);
			//set the line thickness
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(2));
			//Draw the rectangle and fill it with blue color
			g.drawRect(r.getX(),r.getY(),r.getWidth(),r.getHeight());
			g.setColor(Color.BLUE);
			g.fillRect(r.getX(),r.getY(),r.getWidth(),r.getHeight());
			//Set the font type, color, and size. Display the area of the Rectangle to simulate
			//File size
			g.setColor(Color.BLACK);
			Font stringFont = new Font( "Times New Roman", Font.BOLD, 14 );
			g.setFont( stringFont );
//			g.drawString(""+r.getHeight()*r.getWidth(), r.getX()+20,
//					r.getY()-10);
			g.drawString("" + linked.get(i).getFile().getName(), r.getX()+15, 185);

			g.drawString("" + linked.get(i).getFile().length(), r.getX()+20, r.getY()-10);
			//Loop continued on next slide
			//Draw the graph’s axes and name them
			g.drawLine(85, 170, 600, 170);
			g.drawLine(85, 170, 85, 20);
			g.drawString("File size", 60,15);
			g.drawString("Files", 610, 175);
			//Units on the Y-axis in Kilo Bytes. You will use file names on the X-axis when
			//enhancing the program
			g.drawString("7KB", 50,35);
			g.drawString("6KB", 50,55);
			g.drawString("5KB", 50,75);
			g.drawString("4KB", 50,95);
			g.drawString("3KB", 50,115);
			g.drawString("2KB", 50,135);
			g.drawString("1KB", 50,155);
			g.drawString("0KB", 50,175);
			//Reduce the line thickness and draw horizontal lines for the units on the Y-axis
			g2.setStroke(new BasicStroke((float) 0.5));
			g.drawLine(80, 30, 600, 30);
			g.drawLine(80, 50, 600, 50);
			g.drawLine(80, 70, 600, 70);
			g.drawLine(80, 90, 600, 90);
			g.drawLine(80, 110, 600, 110);
			g.drawLine(80, 130, 600, 130);
			g.drawLine(80, 150, 600, 150);
			
		}
	}

	@Override
	//Sorts the graph’s bars (Rectangles) in ascending order, left to right by area using PriorityQueue
	public void actionPerformed(ActionEvent arg0) {

		//Add all Rectangles in the list to the priority queue
		queue.addAll(list);
		//Empty the list
		list.removeAll(list);
		int i = 1;
		//Remove each Rectangle from the queue. Rectangles with smaller area will have higher //priority and will be removed first
		while(!queue.isEmpty()){
			Rectangle r = queue.remove();
			//Change the x-coordinate of the Rectangle so the smaller ones are displayed //before the larger ones going left to right. Use i to set the coordinate
			r.setX(i++*100+10);
			//Add the Rectangle to the end of the list
			list.addLast(r);
		}
		
		priority.addAll(linked);
		linked.removeAll(linked);
		
		while(!priority.isEmpty()) {
			CompareFileSize c = priority.remove();
			linked.addLast(c);
		}

		//Redraw the graph
		repaint();
	}

}
