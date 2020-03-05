package lendup.birthday.app;

import com.lendup.birthday.common.Baloon;
import com.lendup.birthday.common.Baloon.BaloonBuilder;
import com.lendup.birthday.common.Cake;
import com.lendup.birthday.factory.OrderServiceFactory;
import com.lendup.birthday.logger.LOGGER;
import com.lendup.birthday.logger.LogLevel;
import com.lendup.birthday.service.ItemOrderService;

public class App{	

	public void order(BirthdayPartyRequest request) {
		
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
			LOGGER.log(LogLevel.ERROR, "Exception while order items");
		}	
		LOGGER.log(LogLevel.INFO,"Sucessfully Order placed");
	}

}
