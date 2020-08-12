package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	
		String Tanner = "Tanner is COOLER than Derek";
		String Derek = "Derek is clever";
		String Mom = "Mom is the best!";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		
//		String name = JOptionPane.showInputDialog("Enter a name");
//		
//		if( name.equalsIgnoreCase("Derek")) {
//			JOptionPane.showMessageDialog(null, Derek);
//		}
		String name = JOptionPane.showInputDialog("~ENTER NAME HERE~");
		
		
		if (name.equalsIgnoreCase("Derek")) {
			JOptionPane.showMessageDialog(null, Derek);
}

		name = JOptionPane.showInputDialog("~ENTER NAME HERE~");
				
				if (name.equalsIgnoreCase("Tanner")) {
					JOptionPane.showMessageDialog(null, Tanner);
				}
				
		name = JOptionPane.showInputDialog("~ENTER NAME HERE~");
				
		if (name.equalsIgnoreCase("Mom")) {
			JOptionPane.showMessageDialog(null, Mom);
		}
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

