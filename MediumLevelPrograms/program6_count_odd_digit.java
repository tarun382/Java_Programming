import java.util.Scanner;
class program6_count_odd_digit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number....");
		int num = sc.nextInt();
		int temp=num;
		int count=0;
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==1)
			{
				count++;
			}
			num = num/10;
		}
		System.out.println(count+" is the odd count of the given number "+temp);
	}
}
