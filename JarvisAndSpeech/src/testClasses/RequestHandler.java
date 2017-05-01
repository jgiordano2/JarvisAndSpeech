package testClasses;
import java.util.StringTokenizer;
import testClasses.Main;



public class RequestHandler {

// home systems package is generic reusable shared code 

	public String handleRequest(String userRequest)
	{

		String usrReq = userRequest.toUpperCase();

		StringTokenizer st = new StringTokenizer(usrReq);

		String system = st.nextToken();
		
		switch (system) {
		case "LOCKS": 	
			if (st.hasMoreTokens()){
				String lockName = st.nextToken();
				if (Main.locks.pickName(lockName) ){
					if (st.hasMoreTokens()){
						String lockStatus = st.nextToken();
						return Main.locks.statusLock(lockName, lockStatus);
					}
				}
			}else {
				return Main.locks.toString();
			}
			break;
		case "TV": 	
			if (st.hasMoreTokens()){
				String tvFunction = st.nextToken();
				return Main.tv.setTvFunction(tvFunction);
			}else {
				return Main.tv.toString();
			}

		case "TOASTER": 
			if (st.hasMoreTokens()){
				String toasterFunction = st.nextToken();
				return Main.toaster.functionToaster(toasterFunction);
			}else {
				return Main.toaster.toString();
			}
		case "ALARM" : // changing sysout
			
			if (st.hasMoreTokens()){
				String alarmFunction = st.nextToken();
				return Main.alarm.setAlarm(alarmFunction);

			}else {
				return Main.alarm.toString();
			}

			// break; 
		case "DOORS": 
			
			if (st.hasMoreTokens()){
				String doorName = st.nextToken();
				if (Main.door.pickDoor(doorName)){
					String doorCommand = st.nextToken();
					return Main.door.doorFunction(doorCommand);
				}
			}else {
				return Main.door.toString();
			}
			break;

		case "LIGHTS": // changing sysout
			
			if (st.hasMoreTokens()){
				String roomName = st.nextToken();
				if (Main.light.isRoomValid(roomName)){
					if (st.hasMoreTokens()){
						String lightFunction = st.nextToken();
						return Main.light.functionLight(roomName, lightFunction);
					}
				}
			}else {
				return Main.light.toString();
			}
			break;

		case "CAMERA": // changing sysout to security camera
			
			if (st.hasMoreTokens()){
				String cameraFunction =st.nextToken();
				return Main.camera.camFunction(cameraFunction);
			}else {
				return Main.camera.toString();
			}
			
		case "MUSIC":
			
			if (st.hasMoreTokens()){
			String playlist = st.nextToken();
			return Main.spotify.playlistName(playlist);
			}else {
				return Main.spotify.toString();
			}
			
		case "MAIN":
			Main menu = new Main();
			menu.main(null);
		default: 
			
			
		}

		return "I don't understand";

	}

}
