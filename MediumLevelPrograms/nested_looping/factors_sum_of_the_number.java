import java.util.Scanner;
class factors_sum_of_the_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int num = sc.nextInt();
		int sum = 0;
		for(int i =1;i<=num;i++)
		{
			if(num%i==0){
			sum = sum+i;
			}
		}
		System.out.println("sum of the factors"+num+" is "+sum);
	}
	
}
