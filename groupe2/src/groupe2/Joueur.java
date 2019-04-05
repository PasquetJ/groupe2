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
		
		
		Socket socket;
		BufferedReader in;
		
		
		Joueur joueur1= new Joueur();


		try {
		
			socket = new Socket(InetAddress.getLocalHost(),2034);	
		        System.out.println("Demande de connexion");

		        in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		        String message_distant = in.readLine();
		        System.out.println(message_distant);
		        
		        out = new PrintWriter(socket.getOutputStream());
		        out.println("t");
		        out.flush();
		        
		        `
		        
		        
		        
		        
		        socket.close();
		        
		        
		       
		       
		}catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	
	
	
	Mastermind mastermind1= new Mastermind();
	
	System.out.println("Lancement du jeu");
	
	
	List maList = mastermind1.CreerListeCouleur();
	List listeMelange =mastermind1.listeAleatoire(maList);
	List listeJoueur= mastermind1.createListJoueur();
	System.out.println("Votre combinaison: "+listeJoueur);
	
	//Comparaison comparaison1=new Comparaison();
	
	
	// voulez vous changer la liste oui non 
	//comparer les deux listes dans une boucle for avant d'afficher listeMelange
	// listeJoueur.modifierUnecouleur();
	
	System.out.println("La combinaison à trouver était: " +listeMelange);
	
}


	
	
	
	


}
