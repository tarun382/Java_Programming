
import java.util.Scanner;
class program4_count_digit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number...");
		int num=sc.nextInt();
		int temp = num;
		int count=0;
		System.out.println("The count of digits present in the given number "+ num +" is :- ");
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println(count + " is the count of the digits in the given number "+ temp);
	}
}