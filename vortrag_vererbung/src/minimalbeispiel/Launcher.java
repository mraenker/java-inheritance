package minimalbeispiel;

public class Launcher {

	public static void main(String[] args) {
		
		/* Schritt 1: Die einzelnen Konstruktoren 
		   der einzelnen Klassen aufrufen
		*/
		Fahrzeug 	fahrzeug1 		= new Fahrzeug();
		Fahrrad 	fahrrad1		= new Fahrrad();
		Auto 		auto1 			= new Auto();
		
		
		/* Schritt 2: Obwohl die Eigenschaften "reifen", "preis" und "farbe" nicht in den Klassen
		   "Auto" und "Fahrrad" definiert wurden, können sie auf Grund der Vererbung von "Fahrzeug"
			genutzt werden.
		*/
		
		/*
		System.out.println("\n#############\n");
		
		System.out.println(fahrrad1.getClass());
		fahrrad1.reifen = 2;
		System.out.println(fahrrad1.reifen);
		fahrrad1.preis = 20;
		System.out.println(fahrrad1.preis);
		fahrrad1.farbe = "grün";
		System.out.println(fahrrad1.farbe);
		
		System.out.println("\n\n");
		
		System.out.println(auto1.getClass());
		auto1.reifen = 4;
		System.out.println(auto1.reifen);
		auto1.preis = 40000;
		System.out.println(auto1.preis);
		auto1.farbe = "schwarz";
		System.out.println(auto1.farbe);
		*/
		
		
		/* Schritt 3: Auch Methoden der Elternklasse werden 
		   automatisch vererbt und können aufgerufen werden
		*/
		/*
		fahrrad1.losfahren();
		fahrrad1.bremsen();
		
		auto1.losfahren();
		auto1.bremsen();
		*/
		
		/* Hinweis: Alle Methoden und Attribute können derzeit
		/  auch an instanziiertem Objekt vehicle1 aufgerufen werden. */
		
	}
}
