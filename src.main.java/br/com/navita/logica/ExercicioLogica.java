package br.com.navita.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;



public class ExercicioLogica {

	public static void main(String[] args) {
		
		
		String input = "";		
		while (!input.matches("[0-9]+")) {
			input = JOptionPane.showInputDialog("Digite um valor inteiro não negativo: ");
			if (input == null) System.exit(0);
		}
		
		int number = Integer.parseInt(input);		
		JOptionPane.showMessageDialog(null, findFamliy(number));
	}

	public static int findFamliy(int number) {
		
		String output ="";
		
		List<Integer> lista = new ArrayList<Integer>();	
		for (int i = number; i > 0; i /= 10) {
			lista.add(i % 10);
		}
		Collections.sort(lista, Collections.reverseOrder());
		for (int i = 0; i < lista.size(); i++) {
			output = output + lista.get(i);
		}
		return (Integer.parseInt(output) > 100000000) ? -1: Integer.parseInt(output);
	}

}
