package sv.edu.udb.ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// variables
		int option;

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(null,
					// Message
					"What do u want to convert?" + "\n" + "\n" + "Write number 1:" + "\n" + "Dollar to Eur" + "\n"
							+ "\n" + "Write number 2:" + "\n" + "Eur to Dollar:",
					// Title
					"Currency converter",
					// icon
					3));
			switch (option) {
			case 1:
				usdTOeur(0, 0);
				break;
			case 2:
				eurTOusd(0,0);
				break;
			default:
				// stupid case
				JOptionPane.showMessageDialog(null, "Pls enter a valid option", "Error", 0);
			}

		} while (option > 2);

	}

	public static void usdTOeur(double amount, double total) {

		amount = Double.parseDouble(JOptionPane.showInputDialog(null,
				// Message
				"enter ur amount in Dollar",
				// Title
				"Amount",
				// icon
				3));

		// exchange operation
		total = amount * 0.92076792;

		JOptionPane.showMessageDialog(null, "" + amount + " USD" + "\n" + "is equal to" + "\n" + total + " EUR",
				"TOTAL", 1);

	}

	public static void eurTOusd(double amount, double total) {

		amount = Integer.parseInt(JOptionPane.showInputDialog(null,
				// Message
				"enter ur amount in Eur",
				// Title
				"Amount",
				// icon
				3));

		// exchange operation
		total = amount * 1.1148698;

		JOptionPane.showMessageDialog(null, "" + amount + " EUR" + "\n" + "is equal to" + "\n" + total + " USD",
				"TOTAL", 1);

	}

}
