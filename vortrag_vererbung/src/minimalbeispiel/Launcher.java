package minimalbeispiel;

public class Launcher {

	public static void main(String[] args) {
		
		//Schritt 1: Die einzelnen Konstruktoren der einzelnen Klassen aufrufen
		Vehicle 	vehicle1 		= new Vehicle();
		Bike 		bike1 			= new Bike();
		Car 		car1 			= new Car();
		
		//Schritt 2:	Obwohl die Eigenschaften "tyres", "price" und "color" nicht in den Klassen
		// 				"Car" und "Bike" definiert wurden, können sie auf Grund der Vererbung von "Vehicle"
		//				genutzt werden
		
		/*
		System.out.println("\n#############\n");
		
		System.out.println(bike1.getClass());
		bike1.tyres = 2;
		System.out.println(bike1.tyres);
		bike1.price = 20;
		System.out.println(bike1.price);
		bike1.color = "grün";
		System.out.println(bike1.color);
		
		System.out.println("\n\n");
		
		System.out.println(car1.getClass());
		car1.tyres = 4;
		System.out.println(car1.tyres);
		car1.price = 40000;
		System.out.println(car1.price);
		car1.color = "schwarz";
		System.out.println(car1.color);
		*/
	}

}
