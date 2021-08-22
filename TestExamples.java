import java.util.Scanner;

public class TestExamples {

	public static void main(String[] args) 
	{
		System.out.println("Which day is today?");
		Scanner scanner = new Scanner (System.in);
		
		String input =scanner.next();
		String day = "friday";
		if (day.toUpperCase().equals(input.toUpperCase()))
		{
			System.out.println("Your Answer is correct");
		}
		else
		{
			System.out.println("Your Answer is incorrect, correct answer is : " + day);
		}

	}

}
