package javaInterface;

public class PaymentService {
	Pay pay;
	private final String CreditCard = "카드결제";
	private final String Cash = "현금결제";
	
	public void process(String option) {
		if(option.equals(CreditCard)) {
			pay = new CardPay();
		}
		
		else if(option.equals(Cash)) {
			pay = new CashPay();
		}
		
		pay.payment();
	}
	
	public static void main(String[] args) {
		PaymentService service = new PaymentService();
		service.process("카드결제");
	}
}