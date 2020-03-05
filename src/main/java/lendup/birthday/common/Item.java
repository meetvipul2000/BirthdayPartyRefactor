package clendup.birthday.common;

import com.lendup.birthday.enums.ColorType;
import com.lendup.birthday.logger.LOGGER;
import com.lendup.birthday.logger.LogLevel;

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
