class A2{
	void show() {
		System.out.println("A is parent");
	}
}
class B2 extends A2{
	void show1() {
		System.out.println("B is one child");
	}
}
class C2 extends A2{
	void show2() {
		System.out.println("C is one child");
	}
}
public class HeirarchicalDemo {

	public static void main(String[] args) {
 A2 a = new A2();
 B2 b = new B2();
 C2 c = new C2();
 a.show();
 b.show();
 b.show1();
 c.show();
 c.show2();
	}

}
