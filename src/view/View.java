package view;

import javax.swing.JOptionPane;

public class View {
	
	
	public int showMainMenu() {
		String message ="1.Crear Habitacion \n"+
				"2.Crear un paciente \n"+
				"3.Mostrar historial de paciente por habitacion \n"+
				"4.Generar XML \n"+
				"5.salir";
		return Integer.parseInt(JOptionPane.showInputDialog(null,message));
	}
}
