import java.util.*;
public class Calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(Syatem.in);
		System.out.println("Enter two numbers");
		double first=sc.nextDouble();
		double second=sc.nextDouble();
		System.out.println("Enter operation--1.Add\n 2.Subtract\n 3.Multiply\n 4.Division");
		int operator=sc.nextInt();
		double result;
		switch(operator)
		{
			case 1:
				result=first+second;
				System.out.println("%.1f + %.1f=%.1f",first,second,result);
				break;
			case 2:
				result=first-second;
				System.out.println("%.1f - %.1f=%.1f",first,second,result);
				break;
			case 3:
				result=first*second;
				System.out.println("%.1f * %.1f=%.1f",first,second,result);
				break;
			case 4:
				result=first/second;
				System.out.println("%.1f / %.1f=%.1f",first,second,result);
				break;
			default:
				System.out.println("Enter the valid choice");
				return;
		}
	}
}
