package SuperUndThisMitKlammern;

public class Säugetier extends Lebewesen {
	
	public String mutter = "Standardmutter";
	
	Säugetier(){
		super(true);
	}
	
	
	Säugetier(String name, String mutter){
		super.name = name;
		this.mutter = mutter;
		
	}
	
	public void ausgeben() {
		System.out.println("Name: " + name + ", Mutter: " + mutter);
	}
	
	
	Säugetier(String name){
		this(name, "keine Mutter");
	}
	
}
