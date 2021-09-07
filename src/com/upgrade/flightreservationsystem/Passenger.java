package com.upgrade.flightreservationsystem;

public class Passenger {
public int id;
public Address address;
private Contact contact;

public void setContact(Contact contact) {
	this.contact = contact;
}
public Contact getContact() {
	return null;  //just for time being to complete checkpoint 1.later will change the code as the project checkpoints moves further.
}
public Address getAddress() {
	return null      //just for time being to complete checkpoint 1.later will change the code as the project checkpoints moves further.
}
}