package lendup.birthday.service;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Cake;
import lendup.birthday.enums.FlavourType;
import lendup.birthday.enums.OrderSizeType;
import lendup.birthday.logger.LOGGER;
import lendup.birthday.logger.LogLevel;

public class CakeServiceImpl implements ItemOrderService{

	@Override
	public void orderCake(Cake cakeData)  throws Exception{
		LOGGER.log(LogLevel.INFO, "  Cake Ordered initiation ");
	
		if(null==cakeData ){
			throw new Exception("No cake data provided");
		}		
		try{
			//This is dummy failiging scenario where cake can not be processed.
			if(FlavourType.CHOCOLATE == cakeData.getFlavour() && 
					OrderSizeType.SMALL == cakeData.getSize()) {
				
				LOGGER.log(LogLevel.INFO, "Chocolate flavour cake can not be small size");
				
				throw new Exception("Chocolate flavour cake can not be small size");
				
			}
			
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
