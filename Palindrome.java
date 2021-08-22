import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String reverse = "";
		System.out.println("Please enter the details to check if it is palindrome or not : ");
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		//System.out.println("Enter details are : "+ input);
		
		int length = input.length();
		//System.out.println("Length of string is :" + length);
		
		for (int i=length-1;i>=0;i--)
		{
			reverse=reverse+input.charAt(i);
		}
		
		System.out.println("Reverse of String is : " + reverse);
		
		if (input.equals(reverse))
		{
			
			System.out.println("The entered string is Palindrome");
		}
		else
		{
			System.out.println(reverse);
			System.out.println("The entered string is not a Palindrome");
		}
			
		
	}
}
