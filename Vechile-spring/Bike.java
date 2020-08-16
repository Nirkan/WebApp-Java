package com.niraj.kandpal;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile {
	
	public void drive()
	{
		System.out.println("Bhaag raha hai");
	}

}
