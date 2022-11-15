package onlineshopping;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class OnlineShooping extends Thread {
		static Scanner s = new Scanner(System.in);
		static Map<String,Integer> arr = new HashMap<String,Integer>();
		static UsernamePass u = new UsernamePass();
		static OnlineShooping shop = new OnlineShooping();
	public static void main(String[] args) throws IOException {
			try {
			shop.userPass();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	public void userPass() throws IOException {
			try {
				FileInputStream fin = new FileInputStream("D:\\Eclipse\\eclipse\\com.oct\\src\\onlineshopping\\user.properties");
				Properties p = new Properties();
				p.load(fin);
				System.out.println("ENTER YOUR USERNAME");
				u.setUserpass(s.nextLine());
				if (p.containsKey(u.getUserpass())) {
					System.out.println("ENTER YOUR PASSWORD");
					u.setPassword(s.nextLine());
					if (p.containsValue(u.getPassword())) {
						System.out.println("HI WELCOME TO SHOPPING !  " + u.getUserpass());
						shop.productCategory();
					} else {
						System.out.println("WRONG PASSWORD TRY AGAIN");
						shop.userPass();
					}
				} else {
					System.out.println("WRONG USERNAME TRY AGAIN");
					shop.userPass();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public void productCategory() {
			try {
				try{
				Thread.sleep(3000);
				System.out.println("------WELCOME TO X*Y*X ONLINE SHOPPING------");
				}
				catch (Exception e) {
					System.out.println(e);
				}
				try{
					Thread.sleep(4000);
				System.out.println("---THESE ALL ARE PRODUCT CATEGORIES---");
				HashMap<Integer, String> km = new HashMap<Integer, String>();
				km.put(1, "GROCERY");
				km.put(2, "MOBILES");
				km.put(3, "FASHION");
				km.put(4, "ELECTRONICS");
				km.put(5, "APPLIANCES");
				for (Entry<Integer, String> string : km.entrySet()) {
					System.out.println(string);
				}
				}
				catch (Exception e) {
					System.out.println(e);
				}
				Scanner sc = new Scanner(System.in);
				System.out.println("WHICH PRODUCT CATEGORY YOU WANT TO CHOOSE ?");
				String product = sc.next();
				if (product.equalsIgnoreCase("Grocery")) {
					System.out.println("----SO YOU CHOOSE->>>>" + product);
					shop.groceryList();
				} else if (product.equalsIgnoreCase("mobiles")) {
					System.out.println("SO YOU CHOOSE   " + product);
					shop.mobilesList();
				} else if (product.equalsIgnoreCase("fashion")) {
					System.out.println("SO YOU CHOOSE   " + product);
					shop.fashionList();
				} else if (product.equalsIgnoreCase("electronics")) {
					System.out.println("SO YOU CHOOSE   " + product);
					shop.electronicsList();
				} else if (product.equalsIgnoreCase("appliances")) {
					System.out.println("SO YOU CHOOSE   " + product);
					shop.applianceList();
				} else {
					System.out.println(" ");
					System.out.println("SOMETHING WRONG TRY AGAIN");
					shop.productCategory();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public void groceryList() {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----GROCERY CATEGORIES----");
				Map<String,Integer> de = new LinkedHashMap<String,Integer>();
				de.put("GOLDWINNER",120);
				de.put("HARPICPOWERPLUS",45);
				de.put("ONION",80);
				de.put("DETTOLHANDWASH",30);
				de.put("TATATEA",60);
				de.put("RAGIFLOUR",65);
				de.put("CHOCOLATE",57);
				for (Map.Entry<String,Integer> string : de.entrySet()) {
					System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
				u.setGroceryproduct(s.next());
				if (de.containsKey(u.getGroceryproduct())) {
					arr.put(u.getGroceryproduct(),de.get(u.getGroceryproduct()));
					System.out.println(arr);
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(arr.size() + " PRODUCTS IN THE CART");
					System.out.println(
							"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = s.next();
					if (cart.equalsIgnoreCase("yes")) {
						shop.choiceCart();
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println(
								"!!! DO YU WANT TO CONTINUE IN GROCERY CATEGORY CLICK<<--YES OR-->>NO FOR MAIN CATEGORY !!!");
						String decis = s.next();
						if (decis.equalsIgnoreCase("yes")) {
							shop.groceryList();
						} else if (decis.equalsIgnoreCase("no")) {
							shop.productCategory();
						}
					}
				}

				else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					shop.groceryList();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public void mobilesList() {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----MOBILES CATEGORIES----");
				Map<String,Integer> link = new HashMap<String,Integer>();
				link.put("REDMIA1",15000);
				link.put("GALAXYF13",13000);
				link.put("MOTOROLA30",14000);
				link.put("INFINIX11",10000);
				link.put("REALME9",16000);
				link.put("VIVO20",10000);
				link.put("OPPO5G",17000);
				for (Map.Entry<String,Integer> string : link.entrySet()) {
					System.out.println("product- " +string.getKey()+   "--price- " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
				String mobi = s.next();
				if (link.containsKey(mobi)) {
					arr.put(mobi,link.get(mobi));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(arr.size() + " PRODUCTS IN THE CART");
					System.out.println(
							"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = s.next();
					if (cart.equalsIgnoreCase("yes")) {
						shop.choiceCart();
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println(
								"!!! DO YU WANT TO CONTINUE IN MOBILES CATEGORY SHOOPING CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = s.next();
						if (decis1.equalsIgnoreCase("yes")) {
							shop.mobilesList();
						} else if (decis1.equalsIgnoreCase("no")) {
							shop.productCategory();
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					shop.mobilesList();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public void fashionList() {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----MOBILES CATEGORIES----");
				Set<String> set = new TreeSet<String>();
				set.add("menswear");
				set.add("womenwear");
				for (String string : set) {
					System.out.println(string);
				}
				System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
				String fash = s.next();
				if (fash.equalsIgnoreCase("menswear")) {
					shop.menList();
				} else if (fash.equalsIgnoreCase("womenwear")) {
					shop.womenList();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public void menList() {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----MENSWEAR PRODUCTS----");
				Map<String,Integer> hash = new HashMap<String,Integer>();
				hash.put("TSHIRT",400);
				hash.put("PANT",500);
				hash.put("JEANS",300);
				hash.put("SHOES",200);
				for (Map.Entry<String,Integer> string : hash.entrySet()) {
					System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
				String mobi = s.next();
				if (hash.containsKey(mobi)) {
					arr.put(mobi,hash.get(mobi));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(arr.size() + " PRODUCTS IN THE CART");
					System.out.println(
							"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES OR NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = s.next();
					if (cart.equalsIgnoreCase("yes")) {
						shop.choiceCart();
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println(
								"!!! DO YU WANT TO CONTINUE SHOOPING IN MENSWEAR PRODUCTS CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = s.next();
						if (decis1.equalsIgnoreCase("yes")) {
							shop.menList();
						} else if (decis1.equalsIgnoreCase("no")) {
							shop.productCategory();
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					shop.menList();
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		}

		public void womenList() {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----WOMENWEAR PRODUCTS----");
				Map<String,Integer> hash1 = new HashMap<String,Integer>();
				hash1.put("SAREES",2000);
				hash1.put("LEGGINGS",250);
				hash1.put("HEELS",600);
				hash1.put("GOWNS",300);
				for (Map.Entry<String,Integer> string : hash1.entrySet()) {
					System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
				String wear = s.next();
				if (hash1.containsKey(wear)) {
					arr.put(wear,hash1.get(wear));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(arr.size() + " PRODUCTS IN THE CART");
					System.out.println(
							"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = s.next();
					if (cart.equalsIgnoreCase("yes")) {
						shop.choiceCart();
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println(
								"!!! DO YU WANT TO CONTINUE SHOOPING IN WOMENWEAR PRODUCTS CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = s.next();
						if (decis1.equalsIgnoreCase("yes")) {
							shop.womenList();
						} else if (decis1.equalsIgnoreCase("no")) {
							shop.productCategory();
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					shop.womenList();
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		}

		private void electronicsList() {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----ELECTRONICS CATEGORIES----");
				Map<String,Integer> link1 = new HashMap<String,Integer>();
				link1.put("HEADPHONES",500);
				link1.put("SPEAKERS",800);
				link1.put("SOUNDBAR",2000);
				link1.put("POWERBANK",1000);
				link1.put("PRINTER",7000);
				link1.put("CONSOLE",12000);
				for (Map.Entry<String,Integer> string : arr.entrySet()) {
					System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
				String elec = s.next();
				if (link1.containsKey(elec)) {
					arr.put(elec,link1.get(elec));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(arr.size() + " PRODUCTS IN THE CART");
					System.out.println(
							"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = s.next();
					if (cart.equalsIgnoreCase("yes")) {
						shop.choiceCart();
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println(
								"!!! DO YU WANT TO CONTINUE IN ELECTRONICS CATEGORY SHOOPING CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = s.next();
						if (decis1.equalsIgnoreCase("yes")) {
							shop.electronicsList();
						} else if (decis1.equalsIgnoreCase("no")) {
							shop.productCategory();
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					shop.electronicsList();
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}
     private void applianceList() {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----APPLIANCES CATEGORIES----");
				Map<String,Integer> link2 = new LinkedHashMap<String,Integer>();
				link2.put("TV",20000);
				link2.put("WASHINGMACHINE",10000);
				link2.put("AC",15000);
				link2.put("FANS",1000);
				link2.put("FRIDGE",15000);
				link2.put("HEATER",8000);
				for (Map.Entry<String,Integer> string : arr.entrySet()) {
					System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
				String appl = s.next();
				if (link2.containsKey(appl)) {
					arr.put(appl,link2.get(appl));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(arr.size() + " PRODUCTS IN THE CART");
					System.out.println(
							"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES OR NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = s.next();
					if (cart.equalsIgnoreCase("yes")) {
						shop.choiceCart();
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println(
								"!!! DO YU WANT TO CONTINUE IN APPLIANCES CATEGORY FOR SHOPING CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = s.next();
						if (decis1.equalsIgnoreCase("yes")) {
							shop.applianceList();
						} else if (decis1.equalsIgnoreCase("no")) {
							shop.productCategory();
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN!!!");
					shop.applianceList();
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		}

		private void choiceCart() {
			System.out.println("press --1-- for show the cart product");
			System.out.println("press --2-- remove the product from cart");
			int choice = s.nextInt();
			switch (choice) {
			case 1: {
				shop.showCart();
			}
			case 2: {
				shop.removeCart();
			}

			}

		}

		public void showCart() {
			
			for (Map.Entry<String,Integer> string : arr.entrySet()) {
				System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
			}
				try {
				Thread.sleep(5000);
				System.out.println(" IF YOU WANT REMOVE THE PRODUCT ENTER GO <<-- OR NO -->> FOR SEE THE payment CART");
				String start = s.next();
				if (start.equalsIgnoreCase("go")) {
					shop.removeCart();
				} else if (start.equalsIgnoreCase("no")) {
					shop.paymentWay();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		public void removeCart() {
			try {
				for (Map.Entry<String,Integer> string : arr.entrySet()) {
					System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
				}
				System.out.println("WHICH PRODUCT YOU WANT TO REMOVE FROM THE CART");
				String remve = s.next();
				if (arr.containsKey(remve)) {
					arr.remove(remve);
					for (Map.Entry<String,Integer> string : arr.entrySet()) {
						System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
					}
				} else {
					System.out.println("ITS NOT IN THE CART");
					shop.removeCart();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		private void paymentWay() {
			int abc=0;
			for (Map.Entry<String,Integer> string : arr.entrySet()) {
				System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
			}
			for (Map.Entry<String,Integer> string : arr.entrySet()) {
				abc=abc+string.getValue();
			}
			System.out.println("your amount IS "+abc);
			}

}
