package com.amazonaws.lambda.demo;

public class RequestClass {
	public RequestClass() {
		super();
    }
	
	public RequestClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;            
    }
    
    String firstName;
    String lastName;

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
}
