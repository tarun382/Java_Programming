/*wap to find the sum of exponential values of only the even digits to the total count of digits present in the given number
  ex:- 1234
  count = 4
  sum of exponential value of even digits
  4 to the power of 4 is 256
  2 to the power of 4 is 8
  256+8=272
  sum of exponential values of even digits is 272*/
import java.util.Scanner;
class exponential_sum_of_even_digits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int num = sc.nextInt();
		int temp=num;
		int temp1=temp;
		int sum =0;
		int count=0;
		while(temp>0)
		{
			temp = temp/10;
			count++;
		}
		while (num>0)
		{
			int ld=num%10;
			int expo = 1;
			
			if (ld%2==0)
			{
				System.out.println("exponential value of "+ld);
				for(int i=1;i<=count;i++)
				{
					expo=expo*ld;
				}
				sum=sum+expo;
				System.out.println(expo);
			}
			
			num=num/10;
		}
		System.out.println("the exponential sum of all even digits of "+temp1+" is "+sum);
	}
}
