package lendup.birthday.logger;

public enum LogLevel {
	

	INFO("INFO",0),
	WARN("WARN",1),
	ERROR("ERROR",2);

	
	String loglevel;
	Integer code;
	
	LogLevel(String loglevel, Integer code){
		
		this.loglevel=loglevel;
		this.code=code;
	}
	
	public String logLevel() {
        return loglevel ;
    }
	
	public Integer code() {
        return code ;
    }

}
