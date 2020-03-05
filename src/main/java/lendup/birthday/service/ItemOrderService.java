package lendup.birthday.service;

import com.lendup.birthday.common.Baloon;
import com.lendup.birthday.common.Cake;

public interface ItemOrderService {
	
	public void orderCake(Cake cakeData) throws Exception;
	
	public void orderBaloon(Baloon ballonData) throws Exception;
	
	

}
