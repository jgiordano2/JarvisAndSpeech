package testClasses;
import java.util.Scanner;

import javax.swing.JOptionPane;
import model.SpeechMain;


	import homeSystems.*;
	// deleted import my interfaces
	public class Main {
		
		// declare all possible systems
		static Lock locks;
		static TV tv;
		static Toaster toaster;
		static Alarm alarm;
		static GarageDoors door;
		static Light light;
		static SecurityCamera camera;
		static Spotify spotify;
		
		public static void main(String[] args) {
			
			
			// create instance of every system that exists
				 locks = new Lock();
				 tv = new TV();
				 toaster = new Toaster();
				 alarm = new Alarm();
				 door = new GarageDoors();
				 light = new Light();
				 camera = new SecurityCamera();
				 spotify = new Spotify();
				 
				RequestHandler requestHandler = new RequestHandler();
				String userOption = JOptionPane.showInputDialog("Enter ONE of the following: Text or Speech?");

				
				if(userOption.equalsIgnoreCase("text")){
					
					String response = ""; 
					while (true){ 
				//	String userRequest = input.nextLine();
						String userRequest = JOptionPane.showInputDialog(response + "Here are the Home Systems: \n  Locks \n TV  \n Toaster  \n Alarm \n Doors \n Lights \n Cameras \n Music \n 'Main' to return menu \n 'Exit' to stop Jarvis \n Enter your command:");
		
					if (userRequest.equalsIgnoreCase("exit")) break;
						
					
					 response = requestHandler.handleRequest(userRequest) + "! "; 
					// JOptionPane.showInputDialog(response);
					//System.out.println(response);
					 }
				}
				else if(userOption.equalsIgnoreCase("speech")){
				SpeechMain speech = new SpeechMain();
				JOptionPane.showInputDialog("You can speak now. To exit the program just say 'Hey Jarvis Exit!' and to return to main menu say 'Hey Jarvis Main!'");
				}else{
					Main menu = new Main();
					JOptionPane.showInputDialog("Invalid request!");
					menu.main(args);
					}
			}

			
			{
				
				
			}	
		}

