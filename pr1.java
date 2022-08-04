package exp1;
import java.util.Scanner;
class Slip1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch, i,n, cnt, flag, fact, sum;
		do
		{
			System.out.println("1: FIND FACTORIAL");
			System.out.println("2: DISPLAY FIRST 50 NUMBERS");
			System.out.println("3: FIND SUM AND AVG OF N NUMBERS");
			System.out.println("4: EXIT");
			System.out.print("Enter choice= ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.print("Enter Number");
			n=sc.nextInt();
			fact = 1;
			for(i=1; i<=n; i++)
				fact = fact*i;
				System.out.println("Factorial=" + fact);
				break;
				
			case 2: cnt =1;
				n=1;
				while(cnt<=50)
				{
					flag= 1;
					for(i=2; i<=n/2; i++)
					{
						if(n%i==0)
						{
							flag = 0;
							break;
						}
					}
					if(flag==1) {
						System.out.print(n+" ");
						cnt++;
					}
					n++;
				}
				break;
				
			case 3 : System.out.print("Enter limit");
					n=sc.nextInt();
				sum=n*(n+1)/2;
				
				System.out.println("sum"+sum);
				System.out.println("Avg="+(float)sum/n);
				break;
		}
		
		}while(ch!=4);
			sc.close();
	}
	
}

