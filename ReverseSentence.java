import java.util.Scanner;

public class ReverseSentence
{

private static String reverseTheSentence(String inputString)
{
	String OutputString = "";
	String words[] =inputString.split("\\s");
	for (int i=words.length-1;i>=0;i--)
	{
		OutputString = OutputString+words[i]+" ";
		
	}
	return OutputString;
}

public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the input string :");

	String inputString = sc.nextLine();


	String OutputString=reverseTheSentence(inputString);
	
	System.out.println("Input String is:"+ inputString);
	System.out.println("Output String is:" + OutputString);
	sc.close();
}


}

