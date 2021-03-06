public class Account {
	long acno;
	String name;
	float bal;
	/*
	Account() {	}
	*/
	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	//deposit method definition
	void deposit(float amt) {
		this.bal = this.bal + amt;
		System.out.println("Rs."+amt+" Credited | Balance: "+this.bal);
	}
	
	//withdraw method definition
	void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs."+amt+" Debited | Balance: "+this.bal);
		}else {
			System.out.println("ERROR: Insufficient Balance!");
		}
	}
	
	//method definition to get the account details
	void getAccountDetails() {
		System.out.println("A/C No: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
	}
}
