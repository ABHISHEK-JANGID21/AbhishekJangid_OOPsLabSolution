package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.employee.Employee;

public class CredentialService
{
	String email, password;	
	Employee employee= new Employee("",""); 
	
	public String generatePassword() 
	{
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialCharacter = "!@#$%^&*_=+-/.?<>)";
		
		String mix = capitalLetter + smallLetter + number + specialCharacter;

		Random random = new Random();
		String password ="";
		for (int i = 0; i < 4; i++) 
		{
			password+= mix.charAt(random.nextInt(mix.length()));
		}
	    password+=capitalLetter.charAt(random.nextInt(capitalLetter.length()));
		password+=smallLetter.charAt(random.nextInt(smallLetter.length()));
		password+=number.charAt(random.nextInt(number.length()));
	    password+=specialCharacter.charAt(random.nextInt(specialCharacter.length()));
		return password;
	}
	
	
	public String generateEmailAddress(String firstName, String lastName, String department)	
	{
		return firstName + lastName + "@" + department + ".greatLearning.com";	
	}
	
	public void showCredentials(Employee employee, String email, String password)
	{	
		System.out.println("Hello "+employee.getFirstName().toUpperCase() + " "+ employee.getLastName().toUpperCase()+ ", " +"check your details.");
		System.out.println("Email address: " + email);
		System.out.println("Password: "+ password);
	}
}
