package smarthome;

public class Heater implements Device {
	private String name;
	
	public Heater(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " is heating water");
	}
	
	@Override
	public void stop() {
		System.out.println(name + " has stopped heating");
	}
}	
