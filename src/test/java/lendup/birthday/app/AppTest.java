package lendup.birthday.app;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Cake;

public class AppTest {
	
	public static void main(String args[]){
		
		Cake cake = new Cake.CakeBuilder("chocolate", "small")
				.setColor("red")
				.setShape("circle")
				.setFrostingFlavour("chocolate")
				.build();
	
		Baloon baloon = new Baloon.BaloonBuilder("black", "10")
				.setColor("white")
				.setMaterial("lotex")
				.build();
		
		BirthdayPartyRequest req = new BirthdayPartyRequest();
		req.setBaloon(baloon);
		req.setCake(cake);
				
		App app = new App();
		app.order(req);
	}

}
