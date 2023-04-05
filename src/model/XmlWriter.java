package model;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import model.Patient;
import model.Room;

public class XmlWriter {
	DocumentBuilderFactory  factory;
	DocumentBuilder builder;
	DOMImplementation dom;
	Document document;
	public XmlWriter() throws ParserConfigurationException {
		factory= DocumentBuilderFactory.newInstance();
		builder = factory.newDocumentBuilder();
		dom = builder.getDOMImplementation();
		document = dom.createDocument(null, "hospital", null);
	}
	public void guardarhabitaciones(List<Room>rooms) throws TransformerException {
		document.setXmlVersion("1.0");
		Element roomsElements = document.createElement("rooms");
		 for (int i = 0; i < rooms.size(); i++) {
			this.createRoomsElements(rooms.get(i), roomsElements);
		 }
		document.getDocumentElement().appendChild(roomsElements);
		this.createFile();
		
	}
	public void createRoomsElements(Room room,Element roomsElements) {
		Element roomElement = document.createElement("room");
		roomElement.setAttribute("id", ""+room.getId());
		
		roomElement.appendChild(this.getFloorNumberElement(room));
		roomElement.appendChild(this.getRoomNumberElement(room));
		roomElement.appendChild(this.getBedNumberElement(room));
		this.runPatients(room.getPatients(),roomElement);
		roomsElements.appendChild(roomElement);
		
	}
	public Element getFloorNumberElement(Room room) {
		Element floorNumber = document.createElement("florNumber");
		Text floorNumberInText = document.createTextNode(""+room.getFloorNumber());
		floorNumber.appendChild(floorNumberInText);
		
		return floorNumber;
	}
	public Element getRoomNumberElement(Room room) {
		Element roomNumber = document.createElement("roomNumber");
		Text roomNumberInText = document.createTextNode(""+room.getRoomNumber());
		roomNumber.appendChild(roomNumberInText);
		
		return roomNumber;
	}
	public Element getBedNumberElement(Room room) {
		Element bedNumber = document.createElement("bedNumber");
		Text bedNumberInText  = document.createTextNode(""+room.getBedNumbers());
		bedNumber.appendChild(bedNumberInText);
		
		return bedNumber;
	}
	public void runPatients(List<Patient> patients,Element room) {
		for (int i = 0; i < patients.size(); i++) {
			this.createElementsPatients(patients.get(i),room);
		}

	}
	public void createElementsPatients(Patient patient,Element room) {
		
		Element elementPatient = document.createElement("patient");
		elementPatient.appendChild(this.getFirstNameElement(patient));
		elementPatient.appendChild(this.getLastNameElement(patient));
		elementPatient.appendChild(this.getContactPhoneNumberElement(patient));
		room.appendChild(elementPatient);
		
	
	}
	public Element getFirstNameElement(Patient patient) {
		
		Element firstName = document.createElement("Name");
		Text firstNameText = document.createTextNode(patient.getFirstName());
		firstName.appendChild(firstNameText);
		
		return firstName;
	}
	public Element getLastNameElement(Patient patient) {
		
		Element lastName = document.createElement("lastName");
		Text lastNameText = document.createTextNode(patient.getLastName());
		lastName.appendChild(lastNameText);
		
		return lastName;
	}
	public Element getContactPhoneNumberElement(Patient patient) {
		
		Element contactPhoneNumber = document.createElement("contactPhoneNumber");
		Text contactPhoneNumberText = document.createTextNode(patient.getContactPhoneNumber());
		contactPhoneNumber.appendChild(contactPhoneNumberText);
		
		return contactPhoneNumber;
	}
	public void createFile() throws TransformerException {
		Source source = new DOMSource(document);
		Result result = new StreamResult(new File("resources\\rooms.xml"));
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(source, result);
	}
}
