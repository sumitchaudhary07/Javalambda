package OopsConcept;

public class Inheritedapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICI icici=new ICICI();
		icici.createUSer();
		icici.depositMoney();
		icici.withdrawMoney();
		icici.holidayList();
		
		HDFC hdfc=new HDFC();
		hdfc.registerUser();
		hdfc.depositMoney();
		hdfc.withdrawMoney();
		hdfc.holidayList();
		
		SBI sbi=new SBI();
		sbi.quaterlyReport();
		sbi.validateAadhar();
		
		
	}

}
