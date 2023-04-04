package presenter;

import model.Colsanitas;
import view.View;

public class Presenter {
	Colsanitas colsanitas;
	View view;
	public Presenter() {
		view = new View();
		colsanitas = new Colsanitas();
	}
	public static void main(String[] args) {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	public void Run() {
	this.runMainMenu();
	}
	public void runMainMenu() {
		int option=0;
	
			
		
		do {
			try {
			 switch (option=view.showMainMenu()) {
				case 1:
					this.showMenuOfRoom();
				break;
				case 2:
					this.showMenuOfPatient();
				break;
				case 3:
					colsanitas.show();
				break;
				case 4:
				break;
				case 5:
					view.showGraphicMessage("gracias por usar nuestros servicios");
					break;
				default:
					view.showGraphicMessageInvalidOption();
					break;
				}
		} catch (NumberFormatException e) {
			view.showGraphicMessage("Lo siento, ha ocurrido un error. La entrada que ingresó no es un número válido.\n"
					+ "Asegúrese de ingresar solo números y vuelva a intentarlo");
		}
		} while (option!=5);
		
	}
	public void showMenuOfRoom() {
		view.showMessageCreateRoom();
		colsanitas.createRoom(view.readIdRoom(),view.readFloorNumber(),view.readRoomNumber(), view.readBedNumber());
	}
	public void showMenuOfPatient() {
		view.showMessageCreatePatient();
		colsanitas.createPatient(view.readRoomNumberForPatient(),view.readPatientName(),view.readPatientLastName(),view.getContactPhoneNumberByPatient());
		
		
	}
}
