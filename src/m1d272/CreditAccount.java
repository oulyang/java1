package m1d272;

public class CreditAccount extends Account{
	//private String actno;
	//private double balance;
	private double credit;

	

	public CreditAccount() {
		super();
	}
	
	/*
	 * public CriditAccount(String actno, double balance, String actno2, double
	 * balance2, double credit) { super(actno, balance); actno = actno2; balance =
	 * balance2; this.credit = credit; }
	 */
	/*
	 * public String getActno() { return actno; } public void setActno(String actno)
	 * { this.actno = actno; } public double getBalance() { return balance; } public
	 * void setBalance(double balance) { this.balance = balance; }
	 */
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}

}
