import java.util.*;
class addmat {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[][] =  new int[2][2];
		int b[][] =  new int[2][2];
		int c[][] =  new int[2][2];
		int i, j;
		
		System.out.println("Enter first matrix\n");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				a[i][j] =  s.nextInt();
			}
		}
		
		System.out.println("Enter second matrix\n");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				b[i][j] =  s.nextInt();
			}
		}
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Addition of 2 matrices is\n");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
//				a[i][j] =  s.nextInt();
				System.out.print(c[i][j] + " ");
				System.out.println();
			}
		}
	}

}
