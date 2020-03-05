package lendup.birthday.common;

import lendup.birthday.enums.ColorType;
import lendup.birthday.logger.LOGGER;
import lendup.birthday.logger.LogLevel;

public abstract class Item {
	
	String color;
	
	/**
	 * 
	 * @return color
	 */
	public ColorType getColor() {
		
		ColorType colorType = ColorType.BROWN;//setting default cake color
		
		if(null!=color){
			try{
				colorType = ColorType.valueOf(color);
			}catch(IllegalArgumentException iae){
				//default already set earlier
				LOGGER.log(LogLevel.WARN, "No  color provided");
				
			}
		}
		return colorType;
	}

}
