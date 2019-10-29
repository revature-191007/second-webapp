package com.revature.models;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private String generatedSignature;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGeneratedSignature() {
		return generatedSignature;
	}

	public void setGeneratedSignature(String generatedSignature) {
		this.generatedSignature = generatedSignature;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((generatedSignature == null) ? 0 : generatedSignature.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (generatedSignature == null) {
			if (other.generatedSignature != null)
				return false;
		} else if (!generatedSignature.equals(other.generatedSignature))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", generatedSignature="
				+ generatedSignature + "]";
	}

	public Person(int id, String firstName, String lastName, String generatedSignature) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.generatedSignature = generatedSignature;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
