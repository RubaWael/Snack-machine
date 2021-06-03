import java.util.ArrayList;
import java.util.Scanner;

public class SnackMachine {
	private static ArrayList<Product> products = new ArrayList<Product>();
	private static Scanner sc = new Scanner(System.in);
	
	public SnackMachine(){
		this.products = new ArrayList<Product>();
	}
 
	ArrayList <Product> getProducts(){
		return this.products;
	}
	
	public void fillMachine() {
		
		Product p1 = new Product("cola", 7, 200);
		Product p2 = new Product("Water", 5, 100);
		Product p3 = new Product("Ice Coffee", 4, 400);
		Product p4 = new Product("Soda", 5, 400);
		Product p5 = new Product("Laviva", 5, 100);
		Product p6 = new Product("Snickers", 6, 300);
		Product p7 = new Product("Doritos", 6, 200);
		Product p8 = new Product("chetoos", 6, 300);
		Product p9 = new Product("Lays", 7, 300);
		Product p10 = new Product("Twix", 5, 300);
		Product p11 = new Product("Bounty", 5, 400);
		Product p12 = new Product("Mars", 4, 400);
		Product p13 = new Product("Kit Kat", 5, 300);
		Product p14 = new Product("Cookies", 3, 100);
		Product p15 = new Product("m&m", 2, 500);
		Product p16 = new Product("Chocolate cake", 3, 200);
		Product p17 = new Product("OREO", 5, 200);
		Product p18 = new Product("OREO Cake", 7, 100);
		Product p19 = new Product("cadbury", 5, 200);
		Product p20 = new Product("Dairy Milk", 5, 200);
		Product p21 = new Product("OERO Dairy Milk", 5, 200);
		Product p22 = new Product("Maltesers", 5, 500);
		Product p23 = new Product("Crazy", 3, 100);
		Product p24 = new Product("Loacker", 6, 300);
		Product p25 = new Product("Melodi", 8, 200);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		products.add(p11);
		products.add(p12);
		products.add(p13);
		products.add(p14);
		products.add(p15);
		products.add(p16);
		products.add(p17);
		products.add(p18);
		products.add(p19);
		products.add(p20);
		products.add(p21);
		products.add(p22);
		products.add(p23);
		products.add(p24);
		products.add(p25);


	}

	public static boolean isAvailable(int n){
		if(products.get(n).getCount() > 0)
			return true;
		else
			return false;
	}
	
	public void run() {
		
		while(true) {
			
			try {
			//	System.out.println(Products.toString());
				System.out.print("Insert Product number: ");
				int n = sc.nextInt();
				if(n<1 || n>24) {
					System.out.println("There is no Product with this number");
					continue;}
				
				if(!isAvailable(n)) {
					System.out.println("Sold out");
					continue;
				}

				//System.out.println(Products.get(n).getCount());
				int price = products.get(n).getPrice();
				System.out.println("Price: " + price);
				System.out.println("Enter payed method number:");
				System.out.println("1. Coin Slot.");
				System.out.println("2. Card Slot.");
				System.out.println("3. Notes Slot.");
				
				int payedMethodType = sc.nextInt();
				
				
				if (payedMethodType == 1 ) {
					int sum = 0 ;
					System.out.print("Insert the money, only cents: ");
					while (sum < price) {
						int insertedMoney = sc.nextInt();
						if (insertedMoney == 10 || insertedMoney == 20 || insertedMoney == 50 || insertedMoney == 100) {
							sum += insertedMoney;
							System.out.println("inserted money: " + sum  + " Cent.");
						}
						else {
							System.out.println("your currently inserted money are droped !!");
							System.out.println("you can only insert coins with 10, 20, 50, or 100 value.");
						}
					}
					if(sum > price) {
						int remainder = sum-price;
						System.out.println("Remaining money: " + remainder + " Cent.");
					}
					products.get(n).setCount(products.get(n).getCount()-1);	
					System.out.println("item droped: " + products.get(n).getName());
				}
				
				if (payedMethodType == 2 ) {
					System.out.print("did you inserted your card ?");
					String inserted = sc.nextLine();
					
					if ( inserted.equalsIgnoreCase("yes") )  {
						products.get(n).setCount(products.get(n).getCount()-1);
						System.out.println("item droped: " + products.get(n).getName());
					}	
				}
				
				if (payedMethodType == 3 ) {
					int sum = 0 ;
					System.out.print("Insert the money, only notes: ");
					while (sum < price) {
						int insertedMoney = sc.nextInt();
						if (insertedMoney == 20 || insertedMoney == 50 ) {
							sum += insertedMoney * 100;
							System.out.println("inserted money: " + sum  + " Cent.");
						}
						else {
							System.out.println("your currently inserted money are droped !!");
							System.out.println("you can only insert notes with 20 or 50 value.");
						}
					}
					if(sum > price) {
						int remainder = sum-price;
						System.out.println("Remaining money: " + remainder + " Cent.");
					}
					products.get(n).setCount(products.get(n).getCount()-1);	
					System.out.println("item droped: " + products.get(n).getName());
				}
				
				
				
				
			}
			catch (Exception e){
				System.out.print("enter valid number");
				sc.nextLine();;
			}		
		}
	}
}
			
	







