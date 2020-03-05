package lendup.birthday.enums;

public enum ShapeType {
	

	CIRCLE("circle"),
	SQUARE("square"),
	TIRANGLE("traiangle"),
	RANDOM("random"),
	OTHER("other"),
	UNKNOWN("unknown"),
	DEFAULT("default");
	
	String shape;
	
	 ShapeType(String shape){
		this.shape=shape;
	}
	
	public String shape() {
        return shape;
    }

}
