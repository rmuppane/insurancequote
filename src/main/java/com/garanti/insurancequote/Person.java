package com.garanti.insurancequote;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "firstName")
	private java.lang.String firstName;
	@org.kie.api.definition.type.Label(value = "lastName")
	private java.lang.String lastName;
	@org.kie.api.definition.type.Label(value = "DOB")
	private java.lang.String dob;
	@org.kie.api.definition.type.Label(value = "faceAmount")
	private java.lang.Integer faceAmount;
	@org.kie.api.definition.type.Label(value = "income")
	private java.lang.String income;

	public Person() {
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.String getDob() {
		return this.dob;
	}

	public void setDob(java.lang.String dob) {
		this.dob = dob;
	}

	public java.lang.Integer getFaceAmount() {
		return this.faceAmount;
	}

	public void setFaceAmount(java.lang.Integer faceAmount) {
		this.faceAmount = faceAmount;
	}

	public java.lang.String getIncome() {
		return this.income;
	}

	public void setIncome(java.lang.String income) {
		this.income = income;
	}

	public Person(java.lang.String firstName, java.lang.String lastName,
			java.lang.String dob, java.lang.Integer faceAmount,
			java.lang.String income) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.faceAmount = faceAmount;
		this.income = income;
	}

}