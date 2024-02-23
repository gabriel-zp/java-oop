package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int account_number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit? (y/n)");
		String answer = sc.nextLine();
		
		float initial_deposit = 0.00f;
		
		if(answer.equals("y")) {
			System.out.println("Enter the initial deposit: ");
			initial_deposit = sc.nextInt();
		} 
				
		User u = new User(account_number, holder, initial_deposit);
		
		System.out.println(u);

		System.out.println("Enter a deposit value: ");
		float deposit = sc.nextFloat();
		sc.nextLine();
		u.setDeposit(deposit);
		
		
		System.out.println("Enter a withdraw value: ");
		float withdraw = sc.nextFloat();
		sc.nextLine();
		u.setWithdraw(withdraw);
		
		System.out.println(u);
		
	}

}
