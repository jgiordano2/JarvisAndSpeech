package homeSystems;


public class GarageDoors{
	
	public boolean isUp = false;
	enum Door {left , right }
	Door door = Door.left;
	
	public boolean pickDoor(String doorName){
		
		switch (doorName.toLowerCase()){
		case "left":
			door = Door.left;
			break;
		case "right":
			door = Door.right;
			break;
			default:
			return (false);
		}
		return (true);
		}
	
	public String doorFunction(String doorName){
		if(doorName.equalsIgnoreCase("up")){
			isUp = true;
		}
		else if(doorName.equalsIgnoreCase("down")){
			 isUp = false;
		
		}else { 
		 return "sorry, i do not understand";
	}
	return toString ();
	}

	public String toString(){
		return door.toString() + " door is " + (isUp ? "up" : "down" );
		
	}

}
