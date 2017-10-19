package chapter18.recursivetree;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RecursiveTree extends JPanel implements ActionListener {

	private int order;
	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JLabel label;
	
	public RecursiveTree(int order) {
		this.setOrder(order);
		frame = new JFrame("Recursive Tree");
		label = new JLabel("Enter an order");
		textField = new JTextField(5);
		textField.setText(order + "");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		setBackground(Color.WHITE);
		panel = new JPanel(new BorderLayout());
		//Creating the drawing canvas by passing the object
		panel.add(this);
		
		JPanel panel1 = new JPanel();
		panel1.add(label);
		panel1.add(textField);
		panel.add(panel1, BorderLayout.SOUTH);
		
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
		textField.addActionListener(this);
		
	}
	
	public void drawTree(Graphics g, int order, double x, double y, 
			double branchAngle, double branchLength) {
		
		double cx = (x + Math.cos(branchAngle) * branchLength);
		double cy = (y - Math.sin(branchAngle) * branchLength);
		
		Graphics2D g2D=(Graphics2D) g;
		g2D.setStroke(new BasicStroke((float) 2.5));
		g.drawLine((int)x, (int) y, (int) cx, (int)cy);
		double cBranchAngle = Math.toRadians(35);
		double cBranchLength = 0.569;
		
		if (order==0)
			return;
		
		drawTree(g, order-1, cx, cy, branchAngle + cBranchAngle,branchLength * cBranchLength);
		drawTree(g, order-1, cx, cy, branchAngle - cBranchAngle,branchLength * cBranchLength);

	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawTree(g,order,150,220,Math.PI/2.0,60.0);
	}
	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "RecursiveTree [order=" + order + "]";
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
		order = Integer.parseInt(textField.getText());
		}
		catch(NumberFormatException e) {
			System.err.println(e.getMessage());
			System.err.println("NumberformatException Handled");
			System.err.println("Enter a positive integer");
		}
		repaint();
	}

}
