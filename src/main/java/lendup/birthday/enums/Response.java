package lendup.birthday.enums;

public enum Response {
	
	SUCCESS("SUCESS"),
	FAILURE("FAILURE");

	
	String status;
	
	Response(String status){
		
		this.status=status;
	}
	
	public String status() {
        return status ;
    }

}
