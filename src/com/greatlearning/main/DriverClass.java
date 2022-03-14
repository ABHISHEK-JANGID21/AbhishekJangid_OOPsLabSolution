package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.employee.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee("abhishek","jangid");
		CredentialService cs= new CredentialService();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical" +"\n" +"2.  Admin" +"\n" +"3.  Human resourse" +"\n"+"4.  legal");
		
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		String department, email,passCode;
		
		switch(choice)
		{
			case 1:
				    department="tech";
				    email = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
				    passCode = cs.generatePassword();
			        cs.showCredentials(employee, email, passCode);
				    break;
				
			case 2:	
				    department="admin";
				    email = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "admin");
				    passCode = cs.generatePassword();
				    cs.showCredentials(employee, email, passCode);
				    break;
				
			case 3:
					department="hr";
					email = cs.generateEmailAddress(employee.getFirstName(),employee.getLastName(), "hr");
					passCode = cs.generatePassword();
					cs.showCredentials(employee, email, passCode);
					break;
					
			case 4:
					department="legal";
					email = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
					passCode = cs.generatePassword();
					cs.showCredentials(employee, email, passCode);
					break;
					
			default:
			     System.out.println("enter a vaild option");
			     break;
		}
	}
}
