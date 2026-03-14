package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements ElectronicDevice {
	public void useDevice() {
		System.out.println("Laptop is being used");
	}

}
