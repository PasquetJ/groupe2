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
			
			Joueur joueur1= new Joueur();


			try {
			
				
				
					socketjoueur = new Socket(InetAddress.getLocalHost(),2034);	
			        System.out.println("Demande de connexion");

			        in = new BufferedReader (new InputStreamReader (socketjoueur.getInputStream()));
			        String message_distant = in.readLine();
			        System.out.println(message_distant);
			        
			        System.out.println("Lancement du jeu");
					Mastermind mastermind1= new Mastermind();


//					List listeJoueur= mastermind1.creationListeJoueur();
					out = new PrintWriter(socketjoueur.getOutputStream());
			        System.out.println(mastermind1.toString(1));
			        System.out.println(mastermind1.toString(0));
					
//					System.out.println(Comparaison.ComparerDeuxList(mastermind1.getListeJoueur(), mastermind1.toString(0)));

			        
			        out = new PrintWriter(socketjoueur.getOutputStream());
			        System.out.println(Comparaison.ComparerDeuxList(mastermind1.getListeJoueur(), mastermind1.toString(0)));
			        out.flush();
			        		        
			        
			        socketjoueur.close();
			        
			        
			       
			       
			}catch (UnknownHostException e) {
				
				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		
		// voulez vous changer la liste oui non 
		//comparer les deux listes dans une boucle for avant d'afficher listeMelange
		// listeJoueur.modifierUnecouleur();
		
	}

}
