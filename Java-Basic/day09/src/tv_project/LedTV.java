package tv_project;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("티비를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끈다.");

	}

	@Override
	public void changeVolumn(int volume) {
		System.out.println("볼륨을 조정하다.");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("볼륨을 조정하다.");

	}

}
