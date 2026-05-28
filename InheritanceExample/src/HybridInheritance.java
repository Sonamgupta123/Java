class A{
	void show() {
		System.out.println("A is calling");
	}
}
class B extends A{
	void show1() {
		System.out.println("B  is calling");
	}
}
class C extends A{
	void show2() {
		System.out.println("C is calling");
	}
}
class D extends B{
	void show3() {
		System.out.println("D is calling");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
      A a = new A();
      B b = new B();
      C c = new C();
      D d = new D();
       
      a.show();
      b.show();
      b.show1();
      c.show();
      c.show2();
      d.show();
      d.show1();
      d.show3();
      
	}

}
