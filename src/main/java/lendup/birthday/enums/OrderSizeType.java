package lendup.birthday.enums;

public enum OrderSizeType {
	

	SMALL("small"),
	MEDUIM("meduim"),
	LARGE("large");
	
	String size;
	
	OrderSizeType(String size){
		this.size= size;
	}
	
	public String size() {
        return size;
    }
	
}
