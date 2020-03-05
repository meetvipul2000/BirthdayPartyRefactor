package lendup.birthday.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Cake;
import lendup.birthday.enums.Response;


public class AppTest {
	@Test
	public void testAppHasAGreeting() {
		App classUnderTest = new App();

		//sucess case 
		Cake cake = new Cake.CakeBuilder("chocolate", "large")
				.setColor("red")
				.setShape("circle")
				.setFrostingFlavour("chocolate")
				.build();

		Baloon baloon = new Baloon.BaloonBuilder("black", "10")
				.setColor("white")
				.setMaterial("lotex")
				.build();		
		BirthdayPartyRequest request = new BirthdayPartyRequest();
		request.setBaloon(baloon);
		request.setCake(cake);		
		Response response = classUnderTest.order(request);		
		assertEquals(Response.SUCCESS, response);
		
		//failure case 
		Cake cake1 = new Cake.CakeBuilder("chocolate", "small")
				.setColor("red")
				.setShape("circle")
				.setFrostingFlavour("chocolate")
				.build();
		BirthdayPartyRequest request1 = new BirthdayPartyRequest();
		request1.setCake(cake1);		
		Response response1 = classUnderTest.order(request1);		
		assertEquals(Response.FAILURE, response1);

	}
}

//public class AppTest {
//	
////	public static void main(String args[]){
////		
////		Cake cake = new Cake.CakeBuilder("chocolate", "small")
////				.setColor("red")
////				.setShape("circle")
////				.setFrostingFlavour("chocolate")
////				.build();
////	
////		Baloon baloon = new Baloon.BaloonBuilder("black", "10")
////				.setColor("white")
////				.setMaterial("lotex")
////				.build();
////		
////		BirthdayPartyRequest req = new BirthdayPartyRequest();
////		req.setBaloon(baloon);
////		req.setCake(cake);
////				
////		App app = new App();
////		app.order(req);
////	}
//
//}
