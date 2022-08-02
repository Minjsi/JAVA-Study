package javaInterface;

public class CardPay implements Pay {
	@Override
	public void payment() {
		System.out.println("카드 받았습니다.");
	}
}