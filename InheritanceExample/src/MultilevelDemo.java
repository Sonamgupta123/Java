class A1{
	void show() {
		System.out.println("A is calling");
	}
}
class B1 extends A1{
	void show1() {
		System.out.println("B is calling");
	
	}
}
class C1 extends B1{
	void show2() {
		System.out.println("C is calling");
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
    A1 a = new A1();
    B1 b = new B1();
    C1 c = new C1();
     
    a.show();
    b.show();
    b.show1();
    c.show();
    c.show1();
    c.show2();
	}

}
