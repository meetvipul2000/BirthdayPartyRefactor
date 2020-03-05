package lendup.birthday.enums;

public enum MaterialType {

	MYLAR("mylar"),
	LATEX("latex"),

	UNKNOWN("unknown"),
	OTHER("other");

	
	String material;
	
	MaterialType(String material){
		
		this.material=material;
	}
	
	public String material() {
        return material ;
    }
}
