
public class Demo {
	int val1;
	int val2;
	Demo(){
		val1 = 10;
		val2 = 20;
	}
	Demo(int a){
		val1 = val2 = a;
	}
	Demo(int a, int b){
		val1 = a; 
		val2 = b;
	}
	void display() {
		System.out.println("Value 1 = "+val1);
		System.out.println("Value 2 = "+val2);
	}

}
class Democonst{
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo(91);
		Demo d3 = new Demo(2, 5);
		d1.display();
		d2.display();
		d3.display();
	}
}
