import java.util.Scanner;
class factorial_of_odd_digit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num>0)
		{
			int ld = num%10;
			int fact =1;
			
			if(ld%2==1)
			{
				System.out.println("odd factorial of the digit "+ld);
				for(int i=1;i<=ld;i++)
				{
					fact = fact*i;
				}
				System.out.println(fact);
			}
			num=num/10;
		}
	}
}
