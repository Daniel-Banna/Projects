package smarthome;

public class Button extends PowerDevice {
	
	public Button(Device device) {
		super(device);
	}	
	
	@Override
	public void poll() {
		getDevice().run();
	}
}	
