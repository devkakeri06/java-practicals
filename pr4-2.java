
public class Calculate {
	void sum(int a, int b) {
		System.out.println("Sum is:"+(a+b));
	}
	void sum(double a, double b) {
		System.out.println("Sum is:"+(a+b));
	}
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.sum(4,6);
		cal.sum(4.63,6.31);
	}

}
