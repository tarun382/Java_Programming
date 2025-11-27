import java.util.Scanner;
class program13_product_of_odd_digits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();
		int temp = num;
		int product = 1;
		while (num>0)
		{
			int ld=num%10;
			if (ld%2==1)
			{
				product=product*ld;
			}
			
			num=num/10;
		}
		System.out.println(product + " is the product of odd digits present in the given number "+temp);
		
	}
}
