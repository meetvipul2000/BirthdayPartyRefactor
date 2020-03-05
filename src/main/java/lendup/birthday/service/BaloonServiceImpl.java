package lendup.birthday.service;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Cake;
import lendup.birthday.logger.LOGGER;
import lendup.birthday.logger.LogLevel;

public class BaloonServiceImpl implements ItemOrderService{
	
	@Override
	public void orderBaloon(Baloon ballonData) throws Exception{
		LOGGER.log(LogLevel.INFO, "  ballonData Ordered initiation ");
		
		if(null==ballonData ){
			throw new Exception("No baloon data provided");
		}		
		try{
			
			//Order cake here
			
		}catch(Exception e){
			LOGGER.log(LogLevel.ERROR, " System error while ordering baloon");
			throw new Exception("System error while order baloon");
		}
		LOGGER.log(LogLevel.INFO, " baloon Ordered Successfully");
		
	}
	
	@Override
	public void orderCake(Cake cakeData) throws Exception {
		throw new Exception ("UnSupported Method");
		
	}

}
