package smarthome;

public class Lamp implements Device {
	private String name;
	
	public Lamp(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " is ON");
	}
	
	@Override
	public void stop() {
		System.out.println(name + " is OFF");
	}
}	
