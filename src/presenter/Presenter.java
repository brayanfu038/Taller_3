package presenter;

import view.View;

public class Presenter {
	View view;
	public Presenter() {
		view = new View();
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
	}
	public void showMenuOfPatient() {
		view.showMessageCreatePatient();
	}
}
