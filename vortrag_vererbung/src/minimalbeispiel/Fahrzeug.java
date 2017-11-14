package minimalbeispiel;

public class Fahrzeug {

	int reifen = 0;
	int preis = 0;
	String farbe = "keine Farbe";
	
	public Fahrzeug() {
		System.out.println("\n");
		System.out.println("Ich bin ein Vehikel.");
		System.out.println("Räder: " + reifen);
		System.out.println("Preis: " + preis);
		System.out.println("Farbe: " + farbe);
	}
	
	public void losfahren() {
		System.out.println("Das " + this.getClass() + " fährt los!");
	}
	
	public void bremsen() {
		System.out.println("Das " + this.getClass() + " bremst jetzt!");
	}
	
}
