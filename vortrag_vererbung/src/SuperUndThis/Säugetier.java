package SuperUndThis;

public class S�ugetier extends Lebewesen {
	
	public String mutter = "Standardmutter";
	
	S�ugetier(){
		
	}
	
	S�ugetier(String name, String mutter){
		super.name = name;
		this.mutter = mutter;
		
	}
	
	public void ausgeben() {
		System.out.println("Name: " + name + ", Mutter: " + mutter);
	}
	
	
	
}
