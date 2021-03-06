//Time-Converter

//The program takes the amount of days as input and then convert days to seconds.

//Sample Input:
//12 days

//Sample Output:
//1036800 seconds



import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		//your code goes here
		int hours = days * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;
		System.out.println(seconds);
		
	}
}
