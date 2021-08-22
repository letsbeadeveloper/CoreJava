import java.awt.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromArray 
{
	public static void main (String  args[])
	{

//		System.out.println("Hello");
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.next();
		
		AbstractList<String> primes = new ArrayList<String>();
		
		primes.add("2");
		primes.add("3");
		primes.add("5");
		primes.add("3");
		primes.add("5");
		primes.add("7");
		primes.add("A");
		primes.add("B");
		primes.add("A");
		
		
		System.out.println("list of prime numbers : " + primes);
		

		Set<String> primeswithoutDuplicate = new LinkedHashSet<String>(primes);
		
		primes.clear();
		
		primes.addAll(primeswithoutDuplicate);
		System.out.println("list of prime numberswithout duplicates: " + primes);
		
	}
}

