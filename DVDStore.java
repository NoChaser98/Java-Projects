//Josh Shull 47300062 Lab 3-Spring 2021
import java.util.Scanner;
//create main method
public class DVDStore {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//Int variables created
		int priceDVD = 9;
		int totalDVDValue = 10;
		int cashOnHand = 100;
		int userMenuValue;
		int userDVDValue;
		userMenuValue = 0;


		while (userMenuValue != 9) {
		
		//Menu Screen
		System.out.println("");
		System.out.println("Welcome to DVDs R Us. Please choose from the options below");
		System.out.println("1 - Buy DVDs");
		System.out.println("2 - Sell DVDs");
		System.out.println("3 - Check how many DVDs we have in stock");
		System.out.println("4 - Check how much cash we have");
		System.out.println("9 - Exit the program");
		System.out.print("Enter Option: ");
		userMenuValue = scan.nextInt();

			if (userMenuValue == 1){
				System.out.print("Enter the number of DVDs to buy: ");
				userDVDValue = scan.nextInt();
				if (cashOnHand - priceDVD * userDVDValue > 0){
				totalDVDValue = totalDVDValue + userDVDValue;
				System.out.println("Number of DVDs: " + totalDVDValue);
				cashOnHand = cashOnHand - (userDVDValue * priceDVD);
				System.out.println("Cash available: " + cashOnHand);
			}
				else {
					System.out.println("You do not have enough money for this transaction");
					}
					continue;
			}
			else if (userMenuValue == 2) {
				System.out.println("How many DVDs would you like to Sell?");
				userDVDValue = scan.nextInt();
				if (totalDVDValue - userDVDValue >= 1){
				totalDVDValue = totalDVDValue - userDVDValue;
				System.out.println("Number of DVDs: " + totalDVDValue);
				cashOnHand = cashOnHand + (userDVDValue * priceDVD);
				System.out.println("Cash available: " + cashOnHand);
			}
				else {
					System.out.println("You do not have DVDs for this transaction");
					}
					continue;
			}
			else if (userMenuValue == 3) {
				System.out.println("Number of DVDs: " + totalDVDValue);
					continue;
			}
			else if (userMenuValue == 4) {
				System.out.println("Cash Available: " + cashOnHand);
					continue;
			}
			else if (userMenuValue == 9){
				System.out.println("Thank you for shopping with us Please return soon");
					continue;
			}
			else {
				System.out.println("This option is not acceptable");
					continue;
			}
		}	
		

	}
}
