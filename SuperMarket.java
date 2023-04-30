import java.util.Scanner;

//create main method
public class SuperMarket {
	public static void main(String[] args){
		//Declare and assign variables for
		//count of items, item name, taxable, item price, discount, tax,
		//total and grand total
		//Use printf to print the header line used in the spreadsheet for this problem
		Scanner scan = new Scanner(System.in);
		//Item count variables
		int count1 = 4;
		int count2 = 10;
		int count3 = 5;
		int count4 = 4;
		int count5 = 6;
		int count6 = 15;
		int count7 = 1;
		//Taxable or Not Taxable variables
		String taxable1 = "T";
		String taxable2 = "NT";
		String taxable3 = "NT";
		String taxable4 = "T";
		String taxable5 = "T";
		String taxable6 = "T";
		String taxable7 = "T";
		//Price variables
		double price1 = 15.00;
		double price2 = 0.20;
		double price3 = 0.25;
		double price4 = 2.67;
		double price5 = 1.25;
		double price6 = 0.75;
		double price7 = 495.95;
		//Cost variables given item and price multiplied
		double cost1 = count1 * price1;
		double cost2 = count2 * price2;
		double cost3 = count3 * price3;
		double cost4 = count4 * price4;
		double cost5 = count5 * price5;
		double cost6 = count6 * price6;
		double cost7 = count7 * price7;
		//tax and discount rates
		double tax = 0.0825;
		double lt_6_discount = 0.05;
		double lt_11_discount = 0.10;
		double discount = 0.15;
		//First Line
		double discount1 = 0.0;
		if (count1 < 6) {
			discount1 = cost1 * lt_6_discount;
		}
		else if(count1 < 11) {
			discount1 = cost1 * lt_11_discount;
		}
		else {
			discount1 = cost1 * discount;
		}
		double tax1 = 0.0;
		if(taxable1.equalsIgnoreCase("T")){
			tax1 = (cost1 - discount1) * tax;
		}
		double total1 = cost1 - discount1 + tax1;
		//Second Line
		double discount2 = 0.0;
		if (count2 < 6) {
			discount2 = cost2 * lt_6_discount;
		}
		else if(count2 < 11) {
			discount2 = cost2 * lt_11_discount;
		}
		else {
			discount2 = cost2 * discount;
		}
		double tax2 = 0.0;
		if(taxable2.equalsIgnoreCase("T")){
			tax2 = (cost2 - discount2) * tax;
		}
		double total2 = cost2 - discount2 + tax2;
		//Third Line
		double discount3 = 0.0;
		if (count3 < 6) {
			discount3 = cost3 * lt_6_discount;
		}
		else if(count3 < 11) {
			discount3 = cost3 * lt_11_discount;
		}
		else {
			discount3 = cost3 * discount;
		}
		double tax3 = 0.0;
		if(taxable3.equalsIgnoreCase("T")){
			tax3 = (cost3 - discount3) * tax;
		}
		double total3 = cost3 - discount3 + tax3;
		//Fourth Line
		double discount4 = 0.0;
		if (count4 < 6) {
			discount4 = cost4 * lt_6_discount;
		}
		else if(count4 < 11) {
			discount4 = cost4 * lt_11_discount;
		}
		else {
			discount4 = cost4 * discount;
		}
		double tax4 = 0.0;
		if(taxable4.equalsIgnoreCase("T")){
			tax4 = (cost4 - discount4) * tax;
		}
		double total4 = cost4 - discount4 + tax4;
		//Fifth Line
		double discount5 = 0.0;
		if (count5 < 6) {
			discount5 = cost5 * lt_6_discount;
		}
		else if(count5 < 11) {
			discount5 = cost5 * lt_11_discount;
		}
		else {
			discount5 = cost5 * discount;
		}
		double tax5 = 0.0;
		if(taxable5.equalsIgnoreCase("T")){
			tax5 = (cost5 - discount5) * tax;
		}
		double total5 = cost5 - discount5 + tax5;
		//Sixth Line
		double discount6 = 0.0;
		if (count6 < 6) {
			discount6 = cost6 * lt_6_discount;
		}
		else if(count6 < 11) {
			discount6 = cost6 * lt_11_discount;
		}
		else {
			discount6 = cost6 * discount;
		}
		double tax6 = 0.0;
		if(taxable6.equalsIgnoreCase("T")){
			tax6 = (cost6 - discount6) * tax;
		}
		double total6 = cost6 - discount6 + tax6;
		//Seventh Line
		double discount7 = 0.0;
		if (count7 < 6) {
			discount7 = cost7 * lt_6_discount;
		}
		else if(count7 < 11) {
			discount7 = cost7 * lt_11_discount;
		}
		else {
			discount7 = cost7 * discount;
		}
		double tax7 = 0.0;
		if(taxable7.equalsIgnoreCase("T")){
			tax7 = (cost7 - discount7) * tax;
		}
		double total7 = cost7 - discount7 + tax7;
		double finalTotal = total1 + total2 + total3 + total4 + total5 + total6 + total7;
		//Printing spreadsheet of variables and values
		System.out.println("Count      Item             Taxable     Price/Item     Cost      Discount       Tax      Total");
		System.out.println("====================================================================================================");
		System.out.printf("%d%15s%13s%12s%.2f%10s%.2f%5s%.2f%11s%.2f%5s%.2f\n", count1, "Pants", taxable1, "$", price1, "$", cost1, "$", discount1, "$", tax1, "$", total1);
		System.out.printf("%d%15s%13s%11s%.2f%11s%.2f%6s%.2f%11s%.2f%5s%.2f\n", count2, "Apples", taxable2, "$", price2, "$", cost2, "$", discount2, "$", tax2, "$", total2);
		System.out.printf("%d%15s%14s%11s%.2f%11s%.2f%6s%.2f%11s%.2f%5s%.2f\n", count3, "Pears", taxable3, "$", price3, "$", cost3, "$", discount3, "$", tax3, "$", total3);
		System.out.printf("%d%23s%5s%12s%.2f%11s%.2f%5s%.2f%11s%.2f%5s%.2f\n", count4, "Quarts of Oil", taxable4, "$", price4, "$", cost4, "$", discount4, "$", tax4, "$", total4);
		System.out.printf("%d%16s%12s%12s%.2f%11s%.2f%6s%.2f%11s%.2f%5s%.2f\n", count5, "Dishes", taxable5, "$", price5, "$", cost5, "$", discount5, "$", tax5, "$", total5);
		System.out.printf("%d%19s%8s%12s%.2f%11s%.2f%5s%.2f%11s%.2f%5s%.2f\n", count6, "Silverware", taxable6, "$", price6, "$", cost6, "$", discount6, "$", tax6, "$", total6);
		System.out.printf("%d%16s%12s%12s%.2f%9s%.2f%4s%.2f%10s%.2f%4s%.2f\n", count7, "Laptop", taxable7, "$", price7, "$", cost7, "$", discount7, "$", tax7, "$", total7);
		System.out.println("====================================================================================================");
		System.out.printf("                                                                                 Total   $%.2f", finalTotal);
		System.out.println("");
	}

}