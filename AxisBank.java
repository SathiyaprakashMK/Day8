package week5.day2;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit(2000);
		bank.fixed(3000);

	}
	public void deposit(int deposit) {
		System.out.println("Deposit is "+ deposit);
	}

}
