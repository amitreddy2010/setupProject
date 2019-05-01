package org.DI;

public class IndependentDrawClass {
	private String type;
	public void draw(){
		System.out.println("Super draw class shape " + getType());
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
