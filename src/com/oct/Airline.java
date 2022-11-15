package com.oct;

import java.util.Scanner;

public class Airline extends AirlineTicket {

	public static void main(String[] args) {
		Airline air=new Airline();
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to X-Airlines");
	
		System.out.println("Enter the date of jurney: ");
		String date = input.next();
		System.out.println("Choose Your preference : type '1' for First Class or '2' for Economy Class : ");
		int type = input.nextInt();
		System.out.println(" Journey Routes a.KERALA b.BANGLORE c.HYDRABAD ");
		String place = input.next();
		switch (type) {
		case 1:
			firstClass(place);
			break;
		case 2:
			economyClass(place);
			break;
		}
	}
}
