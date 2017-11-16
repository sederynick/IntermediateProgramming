package test2review;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Graphics2DShapesUtility<E> implements ActionListener {

	private ArrayList<E> list;
	private File filePathAndName;
	private JPanel panel;
	private JFrame frame;
	private JButton buttonWriteToFile;
	private JButton buttonClear;
	private JLabel enterFileName;
	private JTextField textField;

	public Graphics2DShapesUtility(ArrayList<E> list, File filePathAndName) {
		super();
		this.list = list;
		this.filePathAndName = filePathAndName;

		frame = new JFrame();
		enterFileName = new JLabel("Enter File Name: ");
		textField = new JTextField(10);
		buttonWriteToFile = new JButton("Write to File: ");
		buttonClear = new JButton("Clear");

		panel = new JPanel(new BorderLayout());
		panel.add(new JPanel());
		JPanel panel1 = new JPanel();

		buttonWriteToFile.setPreferredSize(new Dimension(150, 30));
		buttonClear.setPreferredSize(new Dimension(150, 30));

		panel1 = new JPanel();
		panel.add(panel1);

		panel.add(new JPanel());
		panel1.add(enterFileName);
		panel1.add(textField);
		panel1.add(buttonWriteToFile);
		panel1.add(buttonClear);
		panel.add(panel1);

		frame.add(panel);
		frame.setSize(250, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);

		textField.addActionListener(this);		
		textField.setHorizontalAlignment(SwingConstants.RIGHT);

		buttonWriteToFile.addActionListener(this);
		buttonClear.addActionListener(this);

	}

	public double totalWhiteSpaceArea(double[] array, int lengthOfArray) {
		return totalWhiteSpaceArea(array, lengthOfArray);
	}

	public double totalWhiteSpaceAreaHelpterHelper(ArrayList<E> array) {
		double[] temp = new double[array.size()];
		for(int i = 0; i < array.size(); i++) {
			temp[i]= (double)((RegularPentagon)list.get(i)).getWhiteSpaceArea();
		}
		return totalWhiteSpaceArea(temp, temp.length);
	}

	public void writeGraphics2DShapesToFile(ArrayList<E> list) {



		PrintWriter fileOut = null;

		try {				
			fileOut = new PrintWriter(filePathAndName);
			for(int index = 0; index < list.size(); index++) {
				RegularPentagon r = (RegularPentagon)list.get(index);
				fileOut.print(r.getColor() + " ");
				fileOut.print(r.isFilled() + " ");
				fileOut.println(r.getLengthOfSide());

			}
			System.out.println("Wrote to file " + filePathAndName.getName());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Handlin FIleNotFoundException.");
			System.err.println(e.getMessage());
		}
		finally{
			fileOut.close();
		}
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

			if(arg0.getSource() == buttonClear) {
				textField.setText("");
				textField.grabFocus();
			}
			else {
				String fileName = textField.getText();
				filePathAndName = new File(System.getProperty("user.home") + File.separatorChar + "Desktop"	+ File.separatorChar + "Test2Review" + File.separatorChar + fileName);
				writeGraphics2DShapesToFile(list);
				frame.dispose();
			}


	}




}
