package sample;
import java.util.*;

class Accounts{
	private  String name;
	private int age;
	private int balance;
	public Accounts(String name,int age,int Balance) {
		this.name=name;
		this.setAge(age);
		this.setBalance(Balance);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class Saving extends Accounts{
	
	public Saving(String name,int age,int amount) {
		super(name,age,amount);
	}
	final int MiniBalance=1000;
	public int Withdraw(int amount) {
		if((getBalance()-amount)>=MiniBalance) {
			setBalance(getBalance() - amount);
			return 1;
		}
		return 0;
	}
}

class Current extends Accounts{
	public Current(String name,int age,int amount) {
		super(name,age,amount);
	}
	private int overdraft_limit=10000;
	
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
		System.out.print("Deposite Amount:");
		int amount=sc.nextInt();
		System.out.print("Withdraw Amount:");
		int WithdrawAmount=sc.nextInt();
		Saving save=new Saving("Ashwin",22,amount);
		Current cur=new Current("Ashwin",22,amount);
		System.out.println(save.getName()+" deposited Rupee:"+amount);
		int WithDraw=save.Withdraw(WithdrawAmount);
		if(WithDraw==1) {
			System.out.println("WithDraw Successful");
			System.out.println("Remaining Balance:"+save.getBalance());
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
