package SuperUndThisMitKlammern;

public class S�ugetier extends Lebewesen {
	
	public String mutter = "Standardmutter";
	
	S�ugetier(){
		super(true);
	}
	
	
	S�ugetier(String name, String mutter){
		super.name = name;
		this.mutter = mutter;
		
	}
	
	public void ausgeben() {
		System.out.println("Name: " + name + ", Mutter: " + mutter);
	}
	
	
	S�ugetier(String name){
		this(name, "keine Mutter");
	}
	
}
