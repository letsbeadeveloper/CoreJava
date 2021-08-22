import java.util.Scanner;

public class SortArray 
{

	public static void main(String[] args) 
	{
		
		int a[]= {0,2,6,0,3,0,1,4,0,0,0};
		int temp=0;
		
		System.out.println("Display original value : ");
		for (int i=0;i<=a.length;i++)
		{
			System.out.println(a[i] +" ");
		}
		
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
	}

}
