package tv_project;

public interface TV {
	
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;

	public void turnOn();
	public void turnOff();
	public void changeVolumn(int volume);
	public void changeChannel(int channel);
	
}
