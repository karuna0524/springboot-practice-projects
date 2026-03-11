package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	

	OS os;
	
	public Laptop( OS os) {
			this.os = os;
	}
	
	public void display() {
		System.out.print("A laptop with ");
		os.OStype();
	}

}
