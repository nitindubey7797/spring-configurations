package com.springcore.component;
//
//import java.util.List;
//
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Nitin")
	private String studentname;
	
	@Value("Gwalior")
	private String city;

	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

		
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + "]";
	}
		
}
