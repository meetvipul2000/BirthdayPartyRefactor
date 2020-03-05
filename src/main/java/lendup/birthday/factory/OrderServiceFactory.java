package lendup.birthday.factory;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Cake;
import lendup.birthday.common.Item;
import lendup.birthday.service.BaloonServiceImpl;
import lendup.birthday.service.CakeServiceImpl;
import lendup.birthday.service.ItemOrderService;

public class OrderServiceFactory {
	
	
	public static ItemOrderService getItemOrderService(Item item){
		
		ItemOrderService  service  = null;
		
		if(item instanceof Cake){
			
			service= new CakeServiceImpl();
			
		}else if(item instanceof Baloon){
			
			service= new BaloonServiceImpl();
		}
		return service;
		
	}

}
