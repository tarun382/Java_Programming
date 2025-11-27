import java.util.Scanner;
class program11_product_of_even_digits
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
			if (ld%2==0)
			{
				product=product*ld;
			}
			
			num=num/10;
		}
		System.out.println(product + " is the product of even digits present in the given number "+temp);
		
	}
}