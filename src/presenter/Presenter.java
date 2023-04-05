package presenter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import model.Colsanitas;
import model.XmlWriter;
import view.View;

public class Presenter {
	XmlWriter xmlWriter;
	Colsanitas colsanitas;
	View view;
	public Presenter() throws ParserConfigurationException {
		view = new View();
		colsanitas = new Colsanitas();
		xmlWriter = new XmlWriter();
	}
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		Presenter presenter = new Presenter();
		presenter.Run();
	}
	public void Run() throws TransformerException {
	this.runMainMenu();
	}
	public void runMainMenu() throws TransformerException {
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
					xmlWriter.guardarhabitaciones(colsanitas.getRooms());
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
