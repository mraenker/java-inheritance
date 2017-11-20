package SuperUndThis;

public class Säugetier extends Lebewesen {
	
	public String mutter = "Standardmutter";
	
	Säugetier(){
		
	}
	
	Säugetier(String name, String mutter){
		super.name = name;
		this.mutter = mutter;
		
	}
	
	public void ausgeben() {
		System.out.println("Name: " + name + ", Mutter: " + mutter);
	}
	
	
	
}
