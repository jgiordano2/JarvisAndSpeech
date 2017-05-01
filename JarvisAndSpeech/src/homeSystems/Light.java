package homeSystems;


public class Light  {
	
	boolean lightsOn = false;
	enum Room {bathroom , bedroom , kitchen , basement , office}
	Room room = Room.bathroom;
	
	public boolean isRoomValid(String rooms){
		
		switch (rooms.toLowerCase()){
		
		case "bathroom":
			room = Room.bathroom;
			break;
		case "bedroom" :
			room = Room.bedroom;
			break;
		case "kitchen" :
			room = Room.kitchen;
			break;
		case "basement":
			room = Room.basement;
			break;
		case "office":
			room = Room.office;
			break;
			default:
				return (false);
		}
		return (true);
	}
	
	public String functionLight(String roomName, String lightFunction){
		
		if(lightFunction.equalsIgnoreCase("on")){
			lightsOn = true;
			
		}
		else if(lightFunction.equalsIgnoreCase("off")){
			lightsOn = false;
		}
		else { 
			return "sorry i dont understand";
		}
	return toString();	
	}
	
	public String toString(){
		return room.toString() + " lights are " + (lightsOn ? "on" : "off" );
		
	}	
}