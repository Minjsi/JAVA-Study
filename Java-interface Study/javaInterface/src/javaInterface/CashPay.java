package javaInterface;

class CashPay implements Pay {
	@Override
	public void payment() {
		System.out.println("현금 받았습니다.");
	}
}