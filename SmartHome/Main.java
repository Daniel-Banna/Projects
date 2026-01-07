import smarthome.*;

public class Main {
	public static void main(String[] args) {
		Device bedroomLamp = new Lamp("Bedroom Lamp");
		Device bathroomLamp = new Lamp("Bathroom Lamp");
		Device showerHeater = new Heater("Shower Heater");
		Device coffeeMachine = new CoffeeMachine();
		
		PowerDevice bedroomSwitch = new Switch(bedroomLamp);
		PowerDevice bathroomSwitch = new Switch(bathroomLamp);
		PowerDevice showerSwitch = new Switch(showerHeater);
		PowerDevice coffeeButton = new Button(coffeeMachine);
		
		System.out.println("Starting devices:");
		bedroomSwitch.poll();
		bathroomSwitch.poll();
		showerSwitch.poll();
		coffeeButton.poll();
		
		System.out.println("\nStopping devices:");
		bedroomSwitch.poll();
		bathroomSwitch.poll();
		showerSwitch.poll();
	}
}	
