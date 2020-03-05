package lendup.birthday.app;

import lendup.birthday.common.Baloon;
import lendup.birthday.common.Cake;

public class BirthdayPartyRequest {
	
	Cake cake;
	Baloon baloon;
	
	public Cake getCake() {
		return cake;
	}
	public void setCake(Cake cake) {
		this.cake = cake;
	}
	public Baloon getBaloon() {
		return baloon;
	}
	public void setBaloon(Baloon baloon) {
		this.baloon = baloon;
	}

}
