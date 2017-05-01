package homeSystems;


public class Toaster  {


	boolean isOn = false;
	enum Temperature{LOW, MEDIUM, HIGH }
	Temperature temperature = Temperature.LOW;


	public String functionToaster(String function){ 
		if(function.equalsIgnoreCase("on")){
			isOn = true;
		}

		else if(function.equalsIgnoreCase("off")){
			isOn = false;
			temperature = Temperature.LOW;
		}

		else if(function.equalsIgnoreCase("high")){
			temperature = Temperature.HIGH;	
			isOn = true;
		}
		else if(function.equalsIgnoreCase("medium")){
			temperature = Temperature.MEDIUM;
			isOn = true;
		}
		else if (function.equalsIgnoreCase("low")){
			temperature = Temperature.LOW;
			isOn = true;
		}
		else{

			return "Sorry i dont understand";

		}

		return toString();
		
	}
	public String toString(){
		return "Toaster is " + (isOn ? "on" : "off" ) 
				+ " " + temperature.toString();
		
	}


}




