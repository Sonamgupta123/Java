class Single{
	void show() {
		System.out.println("Single is calling");
	}
}
class S extends Single{
	void show1() {
		System.out.println("S is calling");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Single a = new Single();
		S b = new S();
		a.show();
		b.show();
		b.show1();

	}

}
