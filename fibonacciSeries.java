import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter details upto which digit you need to print fibonacci series : ");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		
		
		if (input>0)
		{
			for (int i=0;i<=input;i++)
			{
				a=0;
				b=1;
				i=a+b;
			}
		}
		else
		{  
			System.out.println("Fibonacci series of mentioned numer is:" + 0);
		}
					
		}
		
		

	}


