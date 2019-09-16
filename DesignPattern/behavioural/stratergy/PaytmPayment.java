package stratergy;

public class PaytmPayment implements PaymentStrategy{

	private String emailId;
	private String password;
	
	
	public  PaytmPayment(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using PayTm.");
	}


}
