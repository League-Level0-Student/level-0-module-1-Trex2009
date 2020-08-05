package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog(null, "Is it your birthday?(mm/dd)");
		if(birthday.equalsIgnoreCase("Today")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}

	}

}
