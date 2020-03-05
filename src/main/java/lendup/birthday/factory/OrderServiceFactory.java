package lendup.birthday.factory;

import com.lendup.birthday.common.Baloon;
import com.lendup.birthday.common.Cake;
import com.lendup.birthday.common.Item;
import com.lendup.birthday.service.BaloonServiceImpl;
import com.lendup.birthday.service.CakeServiceImpl;
import com.lendup.birthday.service.ItemOrderService;

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
