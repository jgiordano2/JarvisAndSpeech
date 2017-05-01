package homeSystems;

public class SecurityCamera{ 

	boolean isOn = true;
enum CameraFunction {snapshot , display , send}
CameraFunction function = CameraFunction.display;
	
public String camFunction(String functionCamera){
	if(functionCamera.equalsIgnoreCase("on")){
		isOn = true;
	}

	else if(functionCamera.equalsIgnoreCase("off")){
		isOn = false;
	}

	else if(functionCamera.equalsIgnoreCase("snapshot")){
		function = CameraFunction.snapshot;	
		isOn = true;
	}
	else if(functionCamera.equalsIgnoreCase("display")){
		function = CameraFunction.display;
		isOn = true;
	}
	else if(functionCamera.equalsIgnoreCase("send")){
		function = CameraFunction.send;
		isOn = true;
	}
	else{

		return "Sorry i dont understand";

	}

	return toString();
	
}
public String toString(){
	return "Security Camera is " + (isOn ? "on" : "off" ) 
			+ " and I will  " + function.toString() + " footage";
}

	}