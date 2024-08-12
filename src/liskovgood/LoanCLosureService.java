package liskovgood;

public class LoanCLosureService {
      private SecureLoan secureLoan;
      
      public LoanCLosureService(SecureLoan secureLoan) {
		this.secureLoan=secureLoan;
	}
      
      public void forceCloseLoan() {
    	  secureLoan.forceCloseLoan();
      }
}
