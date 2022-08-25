public class Area{
	void find(int l, int b) {
		System.out.println("Area is:"+(l*b));
	}
	void find(int l, int b, int h) {
		System.out.println("Area is:"+(l*b*h));
	}
	public static void main(String[] args) {
		Area ar = new Area();
		ar.find(6, 9);
		ar.find(9, 1, 1);
	}
}
