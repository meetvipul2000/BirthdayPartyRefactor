package lendup.birthday.service;

import com.lendup.birthday.common.Baloon;
import com.lendup.birthday.common.Cake;
import com.lendup.birthday.logger.LOGGER;
import com.lendup.birthday.logger.LogLevel;

public class CakeServiceImpl implements ItemOrderService{

	@Override
	public void orderCake(Cake cakeData)  throws Exception{
		LOGGER.log(LogLevel.INFO, "  Cake Ordered initiation ");
	
		if(null==cakeData ){
			throw new Exception("No cake data provided");
		}		
		try{
			
			//Order cake here
			
		}catch(Exception e){
			LOGGER.log(LogLevel.ERROR, " System error while ordering cake");
			throw new Exception("System error while order cake");
		}
		LOGGER.log(LogLevel.INFO, " Cake Ordered Successfully");
		
	
	}

	@Override
	public void orderBaloon(Baloon ballonData) throws Exception {
		throw new Exception ("UnSupported Method");
		
	}



}
