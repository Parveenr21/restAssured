package com.rawatJi;

public class a1_AccountObject {
	
	
	public String email;
	public Integer uniqueID;
	public String login;
	public String lastName;
	public String firstName;
	
	
	/*
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(Integer uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}*/
	
	
	
	@Override
	public String toString() {
		return "AccountObject [email=" + email + ", uniqueID=" + uniqueID + ", login=" + login + ", lastName="
				+ lastName + ", firstName=" + firstName + "]";
	}
	
	
	
	
	
	public a1_AccountObject(a2_BuilderPattern builder) {
		
		this.email = builder.email;
		this.uniqueID = builder.uniqueID;
		this.login = builder.login;
		this.lastName = builder.lastName;
		this.firstName = builder.firstName;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((uniqueID == null) ? 0 : uniqueID.hashCode());
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
		a1_AccountObject other = (a1_AccountObject) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (uniqueID == null) {
			if (other.uniqueID != null)
				return false;
		} else if (!uniqueID.equals(other.uniqueID))
			return false;
		return true;
	}
	
		
	
	

	
	
}
