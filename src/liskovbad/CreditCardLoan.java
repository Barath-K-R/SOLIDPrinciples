package liskovbad;

public class CreditCardLoan implements LoanPayment{

	@Override
	public void doPayment(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forceCloseLoan() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("force closure is not allowed");
	}

	@Override
	public void doRepayment(int amount) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Repayment is not allowed");
	}

}
