package sv.edu.udb.ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		double convertion,temp;
		
		
		int option = Integer.parseInt(JOptionPane.showInputDialog(null,
				// Message
				"What do u want to convert?" + "\n" + "\n" + "Write number 1:" + "\n" + "Celsius to Fahrenheit" + "\n"
						+ "\n" + "Write number 2:" + "\n" + "Fahrenheit to Celsius:",
				// Title
				"Currency converter",
				// icon
				3));
		
		if(option==1) {
			
			temp = Double.parseDouble(JOptionPane.showInputDialog(null,
					// Message
					"enter the temperature in Celsius degrees ",
					// Title
					"temperature",
					// icon
					3));
			
			
			convertion = (temp*1.8)+32;
			
			JOptionPane.showMessageDialog(null, "" + temp + " C" + "\n" + "is equal to" + "\n" + convertion + " F",
					"TOTAL", 1);
		}else if (option==2) {
			temp = Double.parseDouble(JOptionPane.showInputDialog(null,
					// Message
					"enter the temperature in Fahrenheit degrees ",
					// Title
					"temperature",
					// icon
					3));
			
			
			convertion = (temp- 32) / 1.8;
			
			JOptionPane.showMessageDialog(null, "" + temp + " F" + "\n" + "is equal to" + "\n" + convertion + " c",
					"TOTAL", 1);
		}else {
			JOptionPane.showMessageDialog(null, "Pls enter a valid option", "Error", 0);
		}
		
	}
}
