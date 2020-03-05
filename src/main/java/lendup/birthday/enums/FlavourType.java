package lendup.birthday.enums;

public enum FlavourType {
	

	STRABERY("straberry"),
	CHOCOLATE("chocolate"),
	BERRY("berry"),
	UNKNOWN("unknown"),
	DEFAULT("default");
	
	String flavour;
	
	FlavourType(String flavour){
		
		this.flavour=flavour;
	}
	
	public String flavour() {
        return flavour ;
    }

}
