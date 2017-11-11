package minimalbeispiel;

public class Vehicle {

	int tyres = 0;
	int price = 0;
	String color = "keine Farbe";
	
	public Vehicle() {
		System.out.println("\n");
		System.out.println("Ich bin ein Vehikel.");
		System.out.println("Räder: " + tyres);
		System.out.println("Preis: " + price);
		System.out.println("Farbe: " + color);
	}
	
	public void losfahren() {
		System.out.println("Das " + this.getClass() + " fährt los!");
	}
	
	public void bremsen() {
		System.out.println("Das " + this.getClass() + " bremst jetzt!");
	}
	
}
