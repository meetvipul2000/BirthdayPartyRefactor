package lendup.birthday.enums;

public enum DeliveryMode {
	
	CARRYOUT("carryout"),
	DELIVERY("delivery");

	
	String deliveryMode;
	
	DeliveryMode(String deliveryMode){
		
		this.deliveryMode=deliveryMode;
	}
	
	public String deliveryMode() {
        return deliveryMode ;
    }

}
