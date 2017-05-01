package homeSystems;

public class Spotify {
	
	boolean isOn = false;
	enum Playlist {rock , alterntive , classical , rap, no}
	Playlist playlist1 = Playlist.no;
	
	public String playlistName(String playlist){
		if(playlist.equalsIgnoreCase("on")){
			isOn = true;
		}
		else if(playlist.equalsIgnoreCase("off")){
			isOn = false;
			playlist1 = Playlist.no;
		}
	
		else if(playlist.equalsIgnoreCase("rock")){
			isOn = true;
			playlist1 = Playlist.rock;
		}
		else if(playlist.equalsIgnoreCase("rap")){
			isOn = true;
			playlist1 = Playlist.rap;
		}
		else if(playlist.equalsIgnoreCase("classical")){
			isOn = true;
			playlist1 = Playlist.classical;
			
		}else if(playlist.equalsIgnoreCase("alternative")){
			isOn = true;
			playlist1 = Playlist.alterntive;

	}else {
			return "sorry i do not understand";

	}

		return toString();
		
	}
	public String toString(){
		return "Spotify is " + (isOn ? "on" : "off" ) 
				+ " and playing " + playlist1.toString() + " music";
	}
}
