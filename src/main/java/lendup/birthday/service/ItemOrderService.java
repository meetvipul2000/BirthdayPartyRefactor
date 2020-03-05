package lendup.birthday.service;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Cake;

/*
In API interface  to  abstract cake and ballon order service details
 */
public interface ItemOrderService {
	
	public void orderCake(Cake cakeData) throws Exception;
	
	public void orderBaloon(Baloon ballonData) throws Exception;
	
	

}
