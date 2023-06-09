import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args){
		//naming convention of a constant
		//If the name of the constant is one word, capitalize all the letters
		//If the name of the constant is two or more, capitalize all the letters
		//and separate the words with an underscore (e.g. MAX_LENGTH)
		final double PI = 3.1415;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double radius = scan.nextDouble();

		double area = radius * radius * PI;

		//Plus sign (+) has two usages
		//1. Addition
		//2. String concatenation
		//the println will display the String followed by the
		//value of the area variable
		System.out.println("The area is: " + area);
		System.out.println("The area is of the circle with radius " + radius + " is: " + area);
	}
}