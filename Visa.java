package creditcard;

public  class Visa implements Ccard {
	private double balance;
	private double interest;
	private static final double interest_rate = 0.10;
	
//	public Visa(double balance) {
//		setBalance(balance);
//		setInterest();
//	}
	
	public Visa(double balance) {
		setBalance(balance);
		setInterest();
	

    }
	
	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interest_rate;
	}
	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return interest;
	}
	@Override
	public void setInterest() {
		// TODO Auto-generated method stub
		this.interest = balance * interest_rate;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void setBalance(double balance) {
		// TODO Auto-generated method stub
		this.balance = balance;
	}
	
	
	
	}
	
	