import java.util.Scanner;
class program12_product_of_lostdigits
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
			product=product*ld;
			num=num/10;
		}
		System.out.println(product + " is the sum of the given number "+temp);
		
	}
}