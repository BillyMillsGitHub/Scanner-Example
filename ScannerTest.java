package com.qa.ScannerTest;

import java.util.Scanner;

public class ScannerTest {

	public void tryMeOut() {
		// Initiate Scanner
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		String name = scan.nextLine();

		System.out.println("What is your favourite colour?");
		String colour = scan.nextLine();

		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("What would you rate this app out of 10");
		int rating = scan.nextInt();
		
		

		System.out.println("Your name is " + name + " and your favourite colour is " + colour
				 + ", and you rated the app today a " + rating + "/10");
		}
		
	}

	
	

