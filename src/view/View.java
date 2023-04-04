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
	public void showMessageCreateRoom() {
		JOptionPane.showMessageDialog(null, "Crear Habitacion");
	}
	public Integer readIdRoom() {
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id: "));
	}
	public Integer readFloorNumber() {
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de piso: "));
	}
	public Integer readRoomNumber() {
		return Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de habitacion: "));
	}
	public Integer readBedNumber() {
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de camas: "));
	}
	public void showMessageCreatePatient() {
		JOptionPane.showMessageDialog(null, "Crear Paciente");
	}
	public Integer readRoomNumberForPatient() {
		return Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la habitacion: "));
	}
	public String readPatientName() {
		return JOptionPane.showInputDialog("Ingrese el nombre del paciente: ");
	}
	public String readPatientLastName() {
		return JOptionPane.showInputDialog("Ingrese el apellido del paciente: ");
	}
	public String getContactPhoneNumberByPatient() {
		return JOptionPane.showInputDialog("Ingrese el telefono  de contacto: ");
	}
	public void showGraphicMessageInvalidOption() {
		JOptionPane.showMessageDialog(null,"!Opcion Invalida¡");
	}
	public void showGraphicMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}
