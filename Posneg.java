package Pack;

import java.util.Scanner;

public class Posneg 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		if(a>0)
		{
			System.out.println("Positive");
		}
		else if(a<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
		
		
	}

}
