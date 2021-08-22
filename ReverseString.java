import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		String reverse = "";
		System.out.println("Please Enter the string");
		Scanner scanner = new Scanner (System.in);
		
		String input = scanner.next();
		//input = scanner.nextLine();		
		
		int length = input.length();
		System.out.println("Length of string is " + length);
		
		for (int i=length-1;i>=0;i--)
		{
			reverse = reverse + input.charAt(i);
			
		}
		System.out.println("Reverse string is " + reverse);
		
		

	}

}
