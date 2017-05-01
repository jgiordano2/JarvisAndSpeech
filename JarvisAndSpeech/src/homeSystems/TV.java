package homeSystems;


public class TV
{
	
	boolean isOn = false;
	enum Action {sports , netflix , news , up , down , nothing }
	Action action = Action.nothing;
	
	public String setTvFunction(String function){
		if(function.equalsIgnoreCase("on")){
			isOn = true;
		}
		else if(function.equalsIgnoreCase("off")){
			isOn = false;
			action = Action.nothing;
		}
	
		else if(function.equalsIgnoreCase("sports")  ){
			isOn = true;
			action = Action.sports;
		}
		else if(function.equalsIgnoreCase("news")  ){
			action = Action.news;
			isOn = true;
		}
		else if (function.equalsIgnoreCase("netflix")){
			action = Action.netflix;
			isOn = true;
			
		}else if (function.equalsIgnoreCase("down")){
			action = Action.down;
			isOn = true;
			
		}else if (function.equalsIgnoreCase("up")){
			action = Action.up;
			isOn = true;
		}
		else{

			return "Sorry i dont understand";

		}

		return toString();
		
	}
	public String toString(){
		return "Televison is " + (isOn ? "on" : "off" ) 
				+ ((action == Action.up ? " and volume is up" : (action == Action.down ? " and volume is down" :
					" and playing " + action.toString())));
		
	}
}
