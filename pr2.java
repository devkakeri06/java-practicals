import java.util.Scanner;

public class simpleCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ch, i, a, b, fact;
		do {
			System.out.println("1: Add");
			System.out.println("2: Substract");
			System.out.println("3: Multiply");
			System.out.println("4: Divide");
			System.out.println("5: Factorial");
			System.out.println("6: Exit");
			System.out.println("Enter your choice = ");
			ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter two numbers = ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Addition = " + (a+b));
			break;

			case 2: System.out.println("Enter two numbers = ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Substraction = " + (a-b));
			break;

			case 3: System.out.println("Enter two numbers = ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Multiplication = " + (a*b));
			break;

			case 4: System.out.println("Enter two numbers = ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Division = " + ((float)a/b));
			break;

			case 5: System.out.println("Enter a numbers = ");
			a = sc.nextInt();
			fact = 1;
			for(i=1; i<=a; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial = " + fact);
			break;
			}



		}
		while(ch!=6);
	}

}
