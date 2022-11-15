package com.oct;

import java.util.Scanner;

public class AirlineTicket{
	public static void firstClass(String place) {
		int gst = 112;
		String s = "KERALA";
		String s1 = "BANGLORE";
		String s2 = "HYDRABAD";
		int kamount = 12000;
		int bamount = 14500;
		int hamount = 12799;
		Scanner scaner = new Scanner(System.in);

		if (place.equalsIgnoreCase(s)) {

		System.out.println("Avaiable seats from 1 to 5    1.A  2.B 3.C 4.D 5.E");
		int number = scaner.nextInt();
		for (int count1 = 1; count1 <= 5; count1++) {
		if (count1 <= number) {
		System.out.println("seats are available for booking");
		kamount = kamount + gst;
		System.out.println("");
		System.out.println("The cost for ticket reservation is Rs." + kamount + " with GST");
		break;

		} else {
		System.out.println("Sorry, First Class seat bookings are over.");

		}

		}
		}
		if (place.equalsIgnoreCase(s1)) {
		System.out.println("you have selected First Class");
		System.out.println("Avaiable seats from 1 to 5     1.A  2.B 3.C 4.D 5.E");
		int number = scaner.nextInt();
		for (int count1 = 1; count1 <= 5; count1++) {

		if (count1 <= number) {
		System.out.println("seats are available for booking");
		bamount = bamount + gst;
		System.out.println("The cost for ticket reservation is Rs." + bamount + " with GST");
		break;
		} else {

		System.out.println("Sorry, First Class seat bookings are over");
		break;
		}

		}
		}
		if (place.equalsIgnoreCase(s2)) {

		System.out.println("Avaiable seats from 1 to 5    1.A  2.B 3.C 4.D 5.E");
		int number = scaner.nextInt();
		for (int count1 = 1; count1 <= 5; count1++) {
		if (count1 <= number) {
		System.out.println("seats are available for booking");
		kamount = kamount + gst;
		System.out.println("");
		System.out.println("The cost for ticket reservation is Rs." + kamount + " with GST");
		break;

		} else {
		System.out.println("Sorry, First Class seat bookings are over.");
		break;
		}

		}
		}
		}

		public static void economyClass(String place) {
		int gst = 56;
		String s = "KERALA";
		String s1 = "BANGLORE";
		String s2 = "HYDRABAD";
		int kamount = 10000;
		int bamount = 11500;
		int hamount = 10799;
		Scanner scan = new Scanner(System.in);

		if (place.equalsIgnoreCase(s)) {

		System.out.println("Avaiable seats from 6 to 10    6.A  7.B 8.C 9.D 10.E");
		int number = scan.nextInt();
		for (int count = 6; count <= 10; count++) {
		if (count == number) {
		System.out.printf("seats are available for booking ");
		kamount = kamount + gst;
		System.out.println("");
		System.out.println("The cost for ticket reservation is Rs." + kamount + " with GST");
		break;
		} else {
		System.out.println("Sorry, Economy Class seat bookings are over");
		break;
		}
		}
		}
		if (place.equalsIgnoreCase(s1)) {

		System.out.println("Avaiable seats from 6 to 10    6.A  7.B 8.C 9.D 10.E");
		int number = scan.nextInt();
		for (int count = 6; count <= 10; count++) {
		if (count == number) {
		System.out.printf("seats are available for booking ");
		bamount = bamount + gst;
		System.out.println("");
		System.out.println("The cost for ticket reservation is Rs." + bamount + " with GST");
		break;
		} else {
		System.out.println("Sorry, Economy Class seat bookings are over");
		break;
		}
		}
		}
		if (place.equalsIgnoreCase(s2)) {

		System.out.println("Avaiable seats from 6 to 10    6.A  7.B 8.C 9.D 10.E");
		int number = scan.nextInt();
		for (int count = 6; count <= 10; count++) {
		if (count == number) {
		System.out.printf("seats are available for booking ");
		hamount = hamount + gst;
		System.out.println("");
		System.out.println("The cost for ticket reservation is Rs." + hamount + " with GST");
		break;
		} else {
		System.out.println("Sorry, Economy Class seat bookings are over");
		break;
		}
		}
		}
		}

}
