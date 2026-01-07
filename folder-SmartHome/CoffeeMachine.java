package smarthome;

public class CoffeeMachine implements Device {
	
	@Override
	public void run() { // Starten und Stoppen der Kaffeemaschine
		System.out.println("Coffee Machine is brewing coffee"); 
		stop();
	}
	
	@Override
	public void stop() {
		System.out.println("Coffee Machine is off");
	}
}
