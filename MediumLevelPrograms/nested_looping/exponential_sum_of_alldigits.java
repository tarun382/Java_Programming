import java.util.Scanner;
class exponential_sum_of_alldigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number...");
		int num = sc.nextInt();
		int temp = num;
		int temp1=temp;
		int sum = 0;
		int count = 0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		while (num>0)
		{
			int ld = num%10;
			int expo=1;
			
			for(int i=1;i<=count;i++)
			{
				expo = expo*ld;
			}
			System.out.println("Exponential value of " + ld+" is "+expo);
			sum = sum+expo;
			num=num/10;
		}
		System.out.println("sum of all the exponential digits of the number "+temp1+" is "+sum);
	}
}
