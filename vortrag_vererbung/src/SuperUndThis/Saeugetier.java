package SuperUndThis;

public class Saeugetier extends Lebewesen {
	
	public String mutter = "Standardmutter";
	
	Saeugetier(){
		
	}
	
	Saeugetier(String name, String mutter){
		super.name = name;
		this.mutter = mutter;
		
	}
	
	public void ausgeben() {
		System.out.println("Name: " + name + ", Mutter: " + mutter);
	}
	
	
	
}
