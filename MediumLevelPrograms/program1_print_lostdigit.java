import java.util.Scanner;
class program1_print_lostdigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = sc.nextInt();
		while (num>0)
		{
			int ld=num%10;
			System.out.println("the lost digit of the num is "+ld);
			num=num/10;
		}
		
		
	}
}
