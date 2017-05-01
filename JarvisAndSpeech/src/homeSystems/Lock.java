package homeSystems;


public class Lock  {
	
	public boolean isLocked = false;
	enum Door {FRONT , BACK , GARAGE}
	Door door = Door.FRONT;
	
	public boolean pickName(String userInput){
		
		
		switch (userInput.toLowerCase()){
		case "frontdoor":
			door = Door.FRONT;
			break;
		case "backdoor" :
			door = Door.BACK;
			break;
		case "garagedoor" :
			door = Door.GARAGE;
			break;
		default:
			return false;	
		}
		
		return (true);

	}
	public String statusLock( String lockName , String lockStatus){
		if(lockStatus.equalsIgnoreCase("lock")){
			isLocked = true;
		}
		else if(lockStatus.equalsIgnoreCase("unlock")){
			isLocked = false;
		}
		else
		{
			return "Invalid command!";
			
		}
		return toString ();
	}

	public String toString(){
		return door.toString() + " door is " + (isLocked ? "locked" : "unlocked" );
		
	}

}










