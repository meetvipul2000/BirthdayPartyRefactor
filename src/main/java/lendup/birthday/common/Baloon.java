package lendup.birthday.common;

import lendup.birthday.enums.MaterialType;
import lendup.birthday.logger.LOGGER;
import lendup.birthday.logger.LogLevel;

/**
 *  This class contains property of ballon like color and material.
 *  It can be extended to add further properties like shape, theme etc...
 * @author Vipul Patel
 *
 */
public class Baloon extends Item{
	
	private String material;
	private String quantity;

	/***
	 *
	 * @return Material Type
	 */
	public MaterialType getMaterial(){
		
		MaterialType materialType = MaterialType.LATEX;//setting default material
		
		if(null!=material){
			try{
				materialType = MaterialType.valueOf(material);
			}catch(IllegalArgumentException iae){
				//default already set earlier
				LOGGER.log(LogLevel.WARN, "No  material provided");				
			}
		}
		return materialType;
	}

	/**
	 *
	 * @return Integer
	 */
	public Integer getQuantity(){
		
		return Integer.parseInt(quantity);
	}


	
	Baloon(BaloonBuilder builder){
		
		this.material= builder.material;
		this.quantity=builder.quantity;
		this.color= builder.color;
	}
	
	public static class BaloonBuilder{
		private String material;//optional
		private String quantity;//required
		private String color;//required
		
		public BaloonBuilder(String color,String quantity){
			this.color = color;
			this.quantity = quantity;			
		}
		public BaloonBuilder setMaterial(String material){
			this.material=material;
			return this;
		}
	
		public BaloonBuilder setColor(String color){
			this.color=color;
			return this;
		}
		
		public Baloon build(){
			Baloon baloon =  new Baloon(this);
			validateBaloonObject(baloon);
			return baloon;
		}
		
		private void validateBaloonObject(Baloon baloon){
			//Do  object validation here
		}
		
	}


}
