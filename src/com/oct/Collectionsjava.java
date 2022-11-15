package com.oct;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Collectionsjava {

// list in collections
	public static void listing() {
		ArrayList<Object> arr = new ArrayList<Object>();

		arr.add("black");
		arr.add("red");
		arr.add("black");
		arr.add(null);
		System.out.println(arr);

		ArrayList<Object> all = new ArrayList<>(arr);
		all.add(1.55);
		all.add(217.67);
		all.add(0.889);
		System.out.println("list"+all);

		LinkedList<Object> al = new LinkedList<>(arr);
		System.out.println("new list"+al);

		System.out.println("remove"+arr.remove(2));
		System.out.println("hashcode"+arr.hashCode());

		System.out.println(al.addAll(all));
		System.out.println("now elements"+al);
		System.out.println(al.contains("black"));
		System.out.println(all.contains(0.899));
		System.out.println(al.equals(arr));
		System.out.println(al.get(0));

		System.out.println(al.isEmpty());
		System.out.println("again list"+al);
	}

// set in collections
	public static void setting() {
		HashSet<String> h1 = new HashSet<String>();

		h1.add("1096");
		h1.add("2056");
		h1.add("7565");
		h1.add("2017");

		System.out.println("add" + h1);
		h1.addAll(h1);
		System.out.println("addall" + h1);

		System.out.println("elents after that" + h1);

		System.out.println("size" + h1.size());

		TreeSet<String> ts = new TreeSet<String>();

		h1.add("1096");
		h1.add("2056");
		h1.add("7565");
		h1.add("2017");

		System.out.println("size" + ts.size());
		System.out.println("elements" + ts);
	}

//map in collection
	public static void maping() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Arun");
		map.put(2, "anish");
		map.put(3, "Rahul");
		map.put(4, "kali");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			System.out.println("elements: " + map);
			map.remove(2);
			System.out.println("elements after remove: " + map);
			map.replace(3, "Goa");
			System.out.println("elements after replace: " + map);

		}
	}
//queue in collections
	public static void que() {
		PriorityQueue<String> qu = new PriorityQueue<>();

		qu.add("aaa");
		qu.add("vvv");
		qu.add("bbb");

		System.out.println("element" + qu);

	System.out.println("peek" + qu.peek());
		qu.poll();
	System.out.println(qu);
	System.out.println(qu.getClass());
	System.out.println(qu.hashCode());
		qu.remove();
	System.out.println(qu);
		qu.remove("vvv");
	System.out.println(qu);

Deque<Integer> ad = new ArrayDeque<>();

		ad.add(15);
		ad.add(3);
		ad.add(6);

	System.out.println(ad);
		ad.remove(3);
		ad.addFirst(10);
		ad.addLast(50);
	System.out.println("elements"+ad);
	System.out.println(ad.offer(80));
		ad.pollFirst();
		ad.pollLast();
	System.out.println("now elements"+ad);
		System.out.println(ad.peek());
	System.out.println("after peek"+ad);
	ad.removeFirst();
	ad.removeLast();
	System.out.println("now elemnts"+ad);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input :");
		int s = sc.nextInt();
		switch (s) {
		case 1:
			maping();
			break;
		case 2:
			setting();
			break;
		case 3:
			listing();
			break;
		case 4:
			que();
			break;
		}
	}
}
