import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args){
		//creating variables for base and height
		//allowing user input values of declared variables base and height
		//the first print will display the String
		//and will ask for user input of variable base
		//the second print will display the String
		//and will ask for user input of variable height
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a value for the base of a triangle? ");
		int base = scan.nextInt();
		System.out.println("Enter a value for the height of a triangle? ");
		int height = scan.nextInt();

		//creating a double type variable for the application of area of a triangle
		//using a 1/2 base * height equation
		double area = base * height * 0.5;

		//the the third println will display the String 
		//followed by the value of the area of the Triangle

		System.out.println("The area of the triangle is " + area);
	}
}