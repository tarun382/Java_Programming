import java.util.Scanner;
class program7_sum_of_lostdigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while (num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println(sum + " is the sum of the given number "+temp);
		
	}
}
