import java.util.Scanner;

public class Swap2Numberswithout_Third 
{

	public static void main(String[] args)
	{

Scanner sc= new Scanner (System.in);
System.out.println("Enter First variable a is : ");

int a=sc.nextInt();

System.out.println("Enter second variable b is : ");

int b= sc.nextInt();

a=a+b;
b=a-b;
a=a-b;

System.out.println("Value of a is :" + a);

System.out.println("Value of b is :" + b);


	}

}
