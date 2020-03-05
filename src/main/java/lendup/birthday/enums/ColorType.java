package lendup.birthday.enums;

public enum ColorType {


	BLACK("black"),
	RED("red"),
	WHITE("white"),
	BROWN("brown"),
	PINK("pink"),
	UNKNOWN("unknown"),
	OTHER("other");

	
	String color;
	
	ColorType(String color){
		
		this.color=color;
	}
	
	public String color() {
        return color ;
    }

}
