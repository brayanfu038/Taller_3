package model;

public class Patient {	
	
	private String contactPhoneNumber;
	private String firstName;
	private String lastName;
	private Status status;
	
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Patient [contactPhoneNumber=" + contactPhoneNumber + ", firstName=" + firstName + ", lastName="
				+ lastName + ", status=" + status.toString() + "]";
	}
	
	
}
