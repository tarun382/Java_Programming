import java.util.Scanner;
class factorial_sum_of_all_odd_digits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		
		while (num>0)
		{
			int ld = num%10;
			int fact=1;
			if(ld%2==1)
			{
				
				System.out.println("factorial of "+ld+" is ");
				for(int i=1;i<=ld;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				System.out.println(fact);
			}
			num=num/10;

		}
		System.out.println("factorial sum of all odd digits of the "+temp+" is "+sum);
	}
}
