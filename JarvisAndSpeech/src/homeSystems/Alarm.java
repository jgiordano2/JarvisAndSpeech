package homeSystems;


public class Alarm 
{
	boolean isEnabled = false;

	public String setAlarm( String function){
		if(function.equalsIgnoreCase("enable")){
			isEnabled = true;
		}
		else if(function.equalsIgnoreCase("disable")){
			isEnabled = false;
		}
		else return("Please try again and either say 'alarm enable' or 'alarm disable'");

		return toString();
	}

	public String toString(){
		return "Alarm is " + (isEnabled ? "enabled" : "disabled");
	}
}