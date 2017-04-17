package com.synerzip.student.model;

import javax.persistence.Embeddable;

@Embeddable
public class StudentFullName {

	String firstName;
	String midleName;
	String lastName;
	@Override
	public String toString() {
		return "StudentFullName [firstName=" + firstName + ", midleName="
				+ midleName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidleName() {
		return midleName;
	}
	public void setMidleName(String midleName) {
		this.midleName = midleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
