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
}
