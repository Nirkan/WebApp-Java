package com.niraj.kandpal;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		// return "Tyre [brand=" + brand + "]";
		return "Its working";
	}

	
	//constructor
	/*
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
	*/
	

}
