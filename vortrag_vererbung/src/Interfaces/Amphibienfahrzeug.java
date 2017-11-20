package Interfaces;

public class Amphibienfahrzeug implements ILandfahrzeug, IWasserfahrzeug{

	@Override
	public void schwimmen() {
		System.out.println("Ich kann im Wasser schwimmen.");
		
	}

	@Override
	public void fahren() {
		System.out.println("Ich kann an Land fahren.");
		
	}


	
	
	
}
