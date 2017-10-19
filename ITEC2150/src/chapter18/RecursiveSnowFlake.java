package chapter18;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//requires 6 elements(frame, panel, panel1 which encompasses the label/textfield, and this(which
//is the class recursivesnowflake)
@SuppressWarnings("serial")
public class RecursiveSnowFlake extends JPanel implements ActionListener {

	private int order;
	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JLabel label;
	private JPanel panel1;
	
	
	
	
	public RecursiveSnowFlake(int order) {
		this.setOrder(order);
		frame = new JFrame("Recursive Snowflake");
		label = new JLabel("Enter an order");
		textField = new JTextField(5);
		textField.setText(order + "");
		panel = new JPanel(new BorderLayout());
		//Creating the drawing canvas by passing the object
		panel.add(this);
		
		JPanel panel1 = new JPanel();
		panel1.add(label);
		panel1.add(textField);
		panel.add(panel1, BorderLayout.SOUTH);
		
		frame.add(panel);
		frame.setSize(330, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
		textField.addActionListener(this);
		
	}



	public int getOrder() {
		return order;
	}




	public void setOrder(int order) {
		this.order = order;
	}




	@Override
	public String toString() {
		return "RecursiveSnowFlake [order=" + order + "]";
	}

	public void drawSnow(Graphics g, int order, int x1, int y1, int x5, int y5) {
		if (order==0) {
			g.drawLine(x1, y1, x5, y5);
			return;
		}
		 	int deltaX = x5 - x1;
			int deltaY= y5 - y1;
			int x2 = x1 + deltaX / 3;
			int y2 = y1 + deltaY / 3;
			int x3 = (int) (0.5 * (x1+x5) + Math.sqrt(3) * (y1-y5)/6);
			int y3 = (int) (0.5 * (y1+y5) + Math.sqrt(3) * (x5-x1)/6);
			int x4 = x1 + 2 * deltaX /3;
			int y4 = y1 + 2 * deltaY /3;
			
			drawSnow(g, order-1, x1, y1, x2, y2);
			drawSnow(g, order-1, x2, y2, x3, y3);
			drawSnow(g, order-1, x3, y3, x4, y4);
			drawSnow(g, order-1, x4, y4, x5, y5);
	}
	public void paintComponent(Graphics g) {
		//When the swing component is created, Swing API calls the paint() method on the component,
		//and the paint() method then calls the paint component(Graphics g). This in turn calls
		//drawSnow to begin the recursive process and use drawLine() to draw the segments
		//on the canvas.
		//super.paintComponent(g);
		drawSnow(g, order, 20, 280, 280, 280);
		drawSnow(g, order, 280, 280, 150, 20);
		drawSnow(g, order, 150, 20, 20, 280);
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		order = Integer.parseInt(textField.getText());
		//repaint() calls the paint() method on the component to schedule the drawing of the graphic
		//as per Swings graphic object queue.
		repaint();

	}

}
