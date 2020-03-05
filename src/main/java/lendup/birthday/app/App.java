package lendup.birthday.app;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Baloon.BaloonBuilder;
import lendup.birthday.common.Cake;
import lendup.birthday.enums.Response;
import lendup.birthday.factory.OrderServiceFactory;
import lendup.birthday.logger.LOGGER;
import lendup.birthday.logger.LogLevel;
import lendup.birthday.service.ItemOrderService;

public class App{	

	public Response order(BirthdayPartyRequest request) {
		
		// Using enum at this moment, can be concrete class with additaion info
		Response  response = Response.SUCCESS; 
		
		//if request object is null, return failure response
		if(null==request){
			LOGGER.log(LogLevel.ERROR,"Request data is empty");
		}
		
		try{
			// Ordering cake 		
			Cake cake = request.getCake();		
			if(null!=cake){
				ItemOrderService service = OrderServiceFactory.getItemOrderService(cake);
				service.orderCake(cake);
			}		
			
			//Order Baloon .
			Baloon baloon = request.getBaloon();
			if(null!=cake){
				ItemOrderService service = OrderServiceFactory.getItemOrderService(baloon);
				service.orderBaloon(baloon);
			}
		}catch(Exception e){
			//Handle rollback for sucessfull previous any order 
			response = Response.FAILURE;
			LOGGER.log(LogLevel.ERROR, "Exception while order items");
		}	
		LOGGER.log(LogLevel.INFO,"Sucessfully Order placed");
		
		return response ;
	}
	
	

}
