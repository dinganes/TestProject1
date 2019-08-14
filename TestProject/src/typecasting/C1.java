package typecasting;

public class C1 implements I1, I2 {

	@Override
	public void show() {

		System.out.println("show......");

	}

	@Override
	public void display() {

		System.out.println("display");

	}

	public static void main(String[] args) {

		I1 obj = new C1(); // upcasting

		obj.show();

		I2 obj1 = (I2) obj;  // Down casting

	}

}
