package com.amazonaws.lambda.demo;

public class ResponseClass {
	public ResponseClass() {
		super();
    }
	
	public ResponseClass(String greetings) {
        this.greetings = greetings;
    }
    
    String greetings;

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}
