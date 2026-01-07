package smarthome;

public abstract class PowerDevice{
		private Device device;
		
		public PowerDevice(Device device) {
			this.device = device;
	}
	
	public Device getDevice() { //getter für Device
		return device;
	}
	
	public void setDevice(Device device) { //setter für Device
		this.device = device;
	}
		
		public abstract void poll(); //abstract poll methode für die Unterklassen

}
