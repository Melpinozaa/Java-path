package sv.edu.udb.ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		float grade = 0, sum = 0, average;

		int amount = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Enter number of notes to average", "Grade average", 3));

		for (int i = 1; i <= amount; i++) {
			sum = Float.parseFloat(JOptionPane.showInputDialog(null, "Grade" + i, "Grade average", 3));

			grade = grade + sum;
		}

		average = grade / amount;

		JOptionPane.showMessageDialog(null, "The grade average is: " + average, "TOTAL", 1);

	}
}
