package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
ElectronicDevice ref ;

public Student(ElectronicDevice ref) {
	super();
	this.ref = ref;
}

public void study() {
	System.out.println("Student is studying");
}

public void workingDevice() {
	ref.useDevice();
}

}
