package com.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(String[] args) {
	System.out.println("Select option");
	System.out.println("1. Create");
	System.out.println("2. Read");
	System.out.println("3. Update");
	System.out.println("4. Delete");
	
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	
	switch(x) {
	case 1:
		CreatePatient.main(null);
		
	case 2:
		ReadPatient.main(null);
	
	case 3:
		UpdatePatient.main(null);
	
		
	case 4:
		DeletePatient.main(null);
	}
	
	
	}
}