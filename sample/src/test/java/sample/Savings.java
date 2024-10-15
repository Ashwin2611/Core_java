package sample;
import java.util.*;

class Accounts{
	static int Balance;
	public Accounts(int Balance) {
		this.Balance=Balance;
	}
}

class Saving extends Accounts{
	
	public Saving(int amount) {
		super(amount);
	}
	final int MiniBalance=1000;
	public int Withdraw(int amount) {
		if((Balance-amount)>=MiniBalance) {
			Balance-=amount;
			return 1;
		}
		return 0;
	}
}

class Current extends Accounts{
	public Current(int amount) {
		super(amount);
	}
	private int overdraft_limit=100000;
	
	public int getOverdraft() {
		return overdraft_limit;
	}
	public boolean overdraft(int WithdrawAmount) {
		if(WithdrawAmount>=overdraft_limit) {
			return false;
		}
		return true;
	}
}

public class Savings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		int WithdrawAmount=sc.nextInt();
		Saving save=new Saving(amount);
		Current cur=new Current(amount);
		int WithDraw=save.Withdraw(WithdrawAmount);
		if(WithDraw==1) {
			System.out.println("WithDraw Successful");
			System.out.println("Remaining Balance:"+save.Balance);
		}else {
			System.out.println("Don't have sufficient Balance");
		}
		boolean over=cur.overdraft(WithdrawAmount);
		if(over==false) {
			System.out.println("limit Reached");
		}else {
			System.out.println("You can Withdraw upto:"+(cur.getOverdraft()-WithdrawAmount));
		}
		
	}

}
