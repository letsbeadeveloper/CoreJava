import java.util.HashMap;
import java.util.Scanner;

public class OccurenceOfCharacter {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String inputString=sc.nextLine();
		
		HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = inputString.length() - 1; i >= 0; i--) 
	      {
	         if (hMap.containsKey(inputString.charAt(i))) 
	         {
	            int count = hMap.get(inputString.charAt(i));
	            hMap.put(inputString.charAt(i), ++count);
	         } 
	         else 
	         {
	            hMap.put(inputString.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
	   }
}


