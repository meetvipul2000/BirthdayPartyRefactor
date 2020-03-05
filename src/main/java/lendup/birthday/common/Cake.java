package lendup.birthday.common;

import lendup.birthday.enums.FlavourType;
import lendup.birthday.enums.OrderSizeType;
import lendup.birthday.enums.ShapeType;
import lendup.birthday.logger.LOGGER;
import lendup.birthday.logger.LogLevel;

public class Cake extends Item {
	
	private String flavour;
	private String frostingFlavour;
	private String shape;
	private String size;
	
	
	public FlavourType getFrostingFlavour(){
		
		FlavourType frostingFlavourType = FlavourType.CHOCOLATE;//setting default cake flavour
		
		if(null!=flavour){
			try{
				frostingFlavourType = FlavourType.valueOf(frostingFlavour);
			}catch(IllegalArgumentException iae){
				//default already set earlier
				LOGGER.log(LogLevel.WARN, "No  Frosting flavour provided");				
			}
		}
		return frostingFlavourType;
	}
	
	
	public FlavourType getFlavour(){
		FlavourType flavourType = FlavourType.CHOCOLATE;//setting default cake color
		
		if(null!=flavour){
			try{
				flavourType = FlavourType.valueOf(flavour);
			}catch(IllegalArgumentException iae){
				//default already set earlier
				LOGGER.log(LogLevel.WARN, "No  flavour provided");
				
			}
		}
		return flavourType;
	}
	
	public OrderSizeType getSize(){
		OrderSizeType sizeType = OrderSizeType.MEDUIM;//setting default cake color
		
		if(null!=size){
			try{
				sizeType = OrderSizeType.valueOf(size);
			}catch(IllegalArgumentException iae){
				//default already set earlier
				LOGGER.log(LogLevel.WARN, "No  flavour provided");
				
			}
		}
		return sizeType;
	}
	
	public ShapeType getShape(){
		ShapeType shapeType = ShapeType.CIRCLE;//setting default cake color
		
		if(null!=shape){
			try{
				shapeType = ShapeType.valueOf(shape);
			}catch(IllegalArgumentException iae){
				//default already set earlier
				LOGGER.log(LogLevel.WARN, "No  flavour provided");
				
			}
		}
		return shapeType;
	}
	
	Cake(CakeBuilder builder){
		
		this.flavour= builder.flavor;
		this.frostingFlavour=builder.frostingFlavour;
		this.shape=builder.shape;
		this.size=builder.size;
		this.color= builder.color;
	}
	
	public  static class CakeBuilder{
		private String flavor;
		private String frostingFlavour;
		private String shape;
		private String size;
		private String color;
		
		public CakeBuilder(String flavor,String size){
			this.flavor = flavor;
			this.size = size;			
		}
		public CakeBuilder setShape(String shape){
			this.shape=shape;
			return this;
		}
		public CakeBuilder setFrostingFlavour(String frostingFlavour){
			this.frostingFlavour=frostingFlavour;
			return this;
		}
		public CakeBuilder setColor(String color){
			this.color=color;
			return this;
		}
		
		public Cake build(){
			Cake cake =  new Cake(this);
			validateCakeObject(cake);
			return cake;
		}
		
		private void validateCakeObject(Cake cake){
			//Do  object validation here
		}
		
	}

}
