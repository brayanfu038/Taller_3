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
			 switch (option=view.showMainMenu()) {
				case 1:
					this.showMenuOfRoom();
				break;
					
				case 2:
					this.showMenuOfPatient();
				break;
				case 3:
				break;
				case 4:
				break;
				default:
					break;
				}
		} while (option!=5);
	}
	public void showMenuOfRoom() {
		view.showMessageCreateRoom();
		colsanitas.createRoom(view.readIdRoom(),view.readFloorNumber(),view.readRoomNumber(), view.readBedNumber());
	}
	public void showMenuOfPatient() {
		view.showMessageCreatePatient();
	}
}
