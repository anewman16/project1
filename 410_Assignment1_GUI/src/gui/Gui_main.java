package gui;

//https://introcs.cs.princeton.edu/java/15inout/GUI.java.html
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Gui_main{
	//aaron was here

	private JFrame frame;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel label16;
	
	//private JButton button;
	private JPanel panel;


	public Gui_main() {
		frame = new JFrame("Game board");

		
		label1 = new JLabel("P1");
		label2 = new JLabel("P2");
		label3 = new JLabel("P3");
		label4 = new JLabel("P4");
		label5 = new JLabel("*");
		label6 = new JLabel("*");
		label7 = new JLabel("*");
		label8 = new JLabel("*");
		label9 = new JLabel("*");
		label10 = new JLabel("*");
		label11 = new JLabel("*");
		label12 = new JLabel("*");
		label13 = new JLabel("*");
		label14 = new JLabel("*");
		label15 = new JLabel("*");
		label16 = new JLabel("*");
		
		
		panel = new JPanel();
		//outer edge spacing for panel
		panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 10));
		//layout of the grid for the labels
		panel.setLayout(new GridLayout(4, 4 , 10 , 10));
		panel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		panel.contains(150, 150);
		
		

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(label7);
		panel.add(label8);
		panel.add(label9);
		panel.add(label10);
		panel.add(label11);
		panel.add(label12);
		panel.add(label13);
		panel.add(label14);
		panel.add(label15);
		panel.add(label16);
		
	
		frame.setMinimumSize(new Dimension(250, 250));
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Gui_main();
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		count++;
//
//		
//	}
}

