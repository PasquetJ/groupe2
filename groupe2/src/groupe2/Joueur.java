package groupe2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public  class Joueur {
	
	public Joueur() {
			
	}
	public static void main(String[] args) {
		
		
		Socket socketjoueur;
		BufferedReader in;
		PrintWriter out;
		
		


		try {
		
			
		socketjoueur = new Socket(InetAddress.getLocalHost(),2034);	
		System.out.println("Demande de connexion");

		in = new BufferedReader (new InputStreamReader (socketjoueur.getInputStream()));
		String message_distant = in.readLine();
		System.out.println(message_distant);
		
		
		
						
		        
		
		     
		
		        
		socketjoueur.close();
		        
		        
		       
		       
		}catch (UnknownHostException e) {
			
			e.printStackTrace();
			
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	
	
}

}
