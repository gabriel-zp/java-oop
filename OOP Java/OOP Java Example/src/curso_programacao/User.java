package curso_programacao;

public class User {
	private int account_number;
	private String holder;
	private float balance;
	
	public User(int account_number, String holder, float initial_deposit) {
		this.account_number = account_number;
		this.holder = holder;
		this.balance = initial_deposit;
	}
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getAccount_number() {
		return account_number;
	}
	
	public float getInitial_deposit() {
		return this.balance;
	}
	
	public void setDeposit(float deposit) {
		this.balance += deposit;
	}
	
	public void setWithdraw(float withdraw) {
		this.balance -= withdraw;
	}
	
	public String toString() {
		return "Account " + this.getAccount_number() + ", Holder: " + this.getHolder() + ", Balance: $" + getInitial_deposit();
	}
	
	
	
}
