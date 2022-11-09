package com.arijit.upcasting_downcasting;

class Bank{
	public void atmCard() { //specific method
		System.out.println("Everyone eligible for atm card");
	}
	public void time() {// specific method
		System.out.println(" opening Timing 10:30 am and Closing Timing 4:00 pm");
	}
	public void savingAccount() {
		
	}
	public void personalLoan() {
		
	}
	public void goldLoan() {
		
	}
	public void homeLoan() {
		
	}
	public void carLoan() {
		
	}
	
}
class SBI extends Bank{

	@Override
	public void savingAccount() {
		System.out.println("minimum account balance is 500/-");
	}

	@Override
	public void personalLoan() {
		System.out.println("  personal loan interest 12%");
	}

	@Override
	public void goldLoan() {
		System.out.println(" Gold loan interest 8% ");
	}

	@Override
	public void homeLoan() {
		System.out.println(" Home loan interest 9% ");
	}

	@Override
	public void carLoan() {
		System.out.println(" Car loan interest 14% ");
	}
	
	public void sbiLife() {// specific method
		
		System.out.println("life insurance lowest premium starting from 325/- ");
	}
	
	
	
}
 class ICICI extends Bank{
	 
		@Override
		public void savingAccount() {
			System.out.println("minimum account balance is 10000/-");
		}

		@Override
		public void personalLoan() {
			System.out.println(" Personal loan interest 9% ");
		}

		@Override
		public void goldLoan() {
			System.out.println(" Gold loan interest 10% ");
		}

		@Override
		public void homeLoan() {
			
			System.out.println(" Home  loan interest 8.5% ");
		}

		@Override
		public void carLoan() {
			System.out.println(" Car loan interest 15% ");
		}
		
		public void prudentialLifeInsurance() {// specific method
			
			System.out.println("life insurance lowest premium starting from 2000/- ");
		}
		
	 
 }
 class HDFC extends Bank{
		@Override
		public void savingAccount() {
			System.out.println("minimum account balance is 2000/-");

		}

		@Override
		public void personalLoan() {
			System.out.println(" Personal loan interest 7% ");
		}

		@Override
		public void goldLoan() {
			System.out.println(" Gold  loan interest 10% ");
		}

		@Override
		public void homeLoan() {
			System.out.println(" Home  loan interest 8% ");
		}

		@Override
		public void carLoan() {
			System.out.println("Car loan interest 13%");
		}
		
		public void hdfcLife() {// specific method
			
			System.out.println("life insurance lowest premium starting from 800/- ");
		}
		
	 
 }
 class AXIS extends Bank{
	 
	 @Override
		public void savingAccount() {
			System.out.println("minimum account balance is 5000/-");

		}

		@Override
		public void personalLoan() {
			System.out.println(" Personal loan interest 10% ");
		}

		@Override
		public void goldLoan() {
			System.out.println(" Gold  loan interest 11% ");
		}

		@Override
		public void homeLoan() {
			System.out.println(" Home  loan interest 8% ");
		}

		@Override
		public void carLoan() {
			
			System.out.println("Car loan interest 15%");
		}
		public void axisLife() {// specific method
			
			System.out.println("life insurance lowest premium starting from 1200/- ");
		}
		
	 
 }
	

public class BankInfo {

	public static void main(String[] args) {
		
		Bank b1 = new SBI();  //upcasting
		System.out.println("SBI Bank");
		System.out.println("****************");
		b1.time();
		b1.atmCard();
		b1.personalLoan();
		b1.goldLoan();
		b1.homeLoan();
		b1.carLoan();
		
		SBI s = (SBI) b1; //Downcasting
		s.sbiLife();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Bank b2 = new ICICI();    //upcasting
		System.out.println("ICICI Bank");
		System.out.println("**************");
		b2.time();
		b2.atmCard();
		b2.personalLoan();
		b2.goldLoan();
		b2.homeLoan();
		b2.carLoan();
		
		((ICICI)b2).prudentialLifeInsurance(); //Downcasting
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Bank b3 = new HDFC(); //Upcasting
		System.out.println("HDFC Bank");
		System.out.println("**************");
		b3.time();
		b3.atmCard();
		b3.personalLoan();
		b3.goldLoan();
		b3.homeLoan();
		b3.carLoan();
		
		HDFC h = (HDFC) b3;   //Downcasting
		h.atmCard();
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
		Bank b4 = new AXIS(); //Upcasting
		System.out.println("AXIS Bank");
		System.out.println("**************");
		b4.time();
		b4.atmCard();
		b4.personalLoan();
		b4.goldLoan();
		b4.homeLoan();
		b4.carLoan();
		
		((AXIS)b4).personalLoan(); //Downcasting

	}

}
