package SuperUndThisMitKlammern;

public class Saeugetier extends Lebewesen {
	
	public String mutter = "Standardmutter";
	
	Saeugetier(){
		super(true);
	}
	
	
	Saeugetier(String name, String mutter){
		super.name = name;
		this.mutter = mutter;
		
	}
	
	public void ausgeben() {
		System.out.println("Name: " + name + ", Mutter: " + mutter);
	}
	
	
	Saeugetier(String name){
		this(name, "keine Mutter");
	}
	
}
