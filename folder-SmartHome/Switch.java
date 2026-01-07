package smarthome;

public class Switch extends PowerDevice {
	
	private boolean isOn = false;
	
	public Switch(Device device) {
		super(device);
	}

	@Override
	public void poll() {
	if (isOn) {
		getDevice().stop(); // Zugriff auf device über Getter
	} else { 
		getDevice().run();
    }
	isOn = !isOn; // umschalten
	}
}	
