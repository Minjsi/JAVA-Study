package tv_project;

public class LedExam {
	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.changeVolumn(8);
		tv.changeChannel(20);
		tv.turnOff();
	}
}
