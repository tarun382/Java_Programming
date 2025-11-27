import java.util.Scanner;
class program9_sum_of_odd_lostdigits
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
			if(ld%2==1)
			{
			sum=sum+ld;
			}
			num=num/10;
		}
		System.out.println(sum + " is the sum of all the odd digits present in the given number "+temp);
		
	}
}