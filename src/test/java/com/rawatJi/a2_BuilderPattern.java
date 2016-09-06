package com.rawatJi;

public class a2_BuilderPattern {



	public String email;
	public Integer uniqueID;
	public String login;
	public String lastName;
	public String firstName;
	private static  a2_BuilderPattern builderreference;


	private a2_BuilderPattern() {

	}




	public static a2_BuilderPattern builder()
	{
		if(builderreference==null)
		{
			builderreference=new a2_BuilderPattern();
		}
		return builderreference;
	}







	public a2_BuilderPattern setEmail(String email) {
		this.email = email;
		return this;
	}




	public a2_BuilderPattern setUniqueID(Integer uniqueID) {
		this.uniqueID = uniqueID;
		return this;
	}




	public a2_BuilderPattern setLogin(String login) {
		this.login = login;
		return this;
	}




	public a2_BuilderPattern setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}




	public a2_BuilderPattern setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}



public a1_AccountObject build()
{
	
	return new a1_AccountObject(this);
}











}
