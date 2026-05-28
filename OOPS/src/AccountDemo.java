import java.util.Scanner;

class Account{
	int accno;
	String name;
	double bal;
	void openAcc() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter acco. num");
		this.accno = s.nextInt();
		// this : it is a reference object of class,store reference address of current object 
		System.out.println("Enter the name:");
	    name = s.next();
	    System.out.println("Enter balance");
	    bal = s.nextDouble();
	    
	}
	void enq() {
		System.out.println("Acc "+accno);
		System.out.println("name "+name);
		System.out.println("balance "+bal);
		
	}
	void deposit() {
		Scanner s = new Scanner(System.in);
		double amt;
		System.out.println("Enter the amount you want to deposit");
		amt = s.nextDouble();
		bal = bal+amt;
		System.out.println("Current balance is"+bal);
	}
	void withdraw() {
		Scanner s = new Scanner(System.in);
		double amt;
		System.out.println("Enter the amount you want to withdraw");
		amt = s.nextDouble();
		bal = bal-amt;
		System.out.println("Remaining balance is"+bal);
	}
	
}
public class AccountDemo {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.openAcc();
		a1.enq();
		a1.deposit();
		a1.withdraw();
		Account a2 = new Account();	
		a2.openAcc();
		a2.enq();
		a2.deposit();
		a2.withdraw();
 
	}

}
