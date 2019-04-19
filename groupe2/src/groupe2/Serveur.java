package groupe2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur {
	
	
	public Serveur() {
		
	}

	
	public static void main(String[] zero) {
		
		ServerSocket socketserver  ;
		Socket socketduserveur ;
		BufferedReader in;
		PrintWriter out;
		
		
		try {
		
			socketserver = new ServerSocket(2034);
			System.out.println("Connectez-vous!");
			socketduserveur = socketserver.accept(); 
		   
			out = new PrintWriter(socketduserveur.getOutputStream());
		    out.println("Vous êtes connecté !");
		    System.out.println("Lancement du jeu");
		    
		    
		    out.flush();
		    
		                
		   
		    socketserver.close();
		    
		    Mastermind mastermind1= new Mastermind();
			Comparaison comparaison1 = new Comparaison();
					
				

			
			
			System.out.println(mastermind1.toString(1));
			//System.out.println(mastermind1.toString(0));
			System.out.println(comparaison1.comparaison(mastermind1.getListeJoueur(),mastermind1.toString(0)));
			 socketduserveur.close();				
			  socketserver.close();  
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
