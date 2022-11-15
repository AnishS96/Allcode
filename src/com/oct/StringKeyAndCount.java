package com.oct;

import java.util.Scanner;

public class StringKeyAndCount {

	public static void main(String[] args) {
		int ap = 0;
		int ap1 = 0;
		int ap2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key : ");
		String st = sc.next();
		String str = "key=13,count=14|key=12,count=8|key=4,count=7";
		String s[] = str.split("[=,|]");
		for (int i = 0; i < s.length; i++) {

			if (st.equals(s[1])) {
				ap = Integer.parseInt(s[3]);
				ap = ap + 1;
				System.out.println(ap);
				break;
			}
			else if  (st.equals(s[5])) {
				ap1 = Integer.parseInt(s[7]);
				ap1 = ap1 + 1;
				System.out.println(ap1);
				break;
			}
			else if (st.equals(s[9])) {
				ap2 = Integer.parseInt(s[11]);
				ap2 = ap2 + 1;
				System.out.println(ap2);
				break;
			}
			else {
				System.out.println("not foud");
			}
		
			}
		}

	}


