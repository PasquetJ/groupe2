package groupe2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class LancementJeu {

	public static void main(String[] args) {
			
			
			Socket socket;
			BufferedReader in;
			
			Joueur joueur1= new Joueur();


			try {
			
				socket = new Socket(InetAddress.getLocalHost(),2036);	
			        System.out.println("Demande de connexion");

			        in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
			        String message_distant = in.readLine();
			        System.out.println(message_distant);
			        
			        socket.close();
			        
			        
			       
			       
			}catch (UnknownHostException e) {
				
				e.printStackTrace();
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		
		Mastermind mastermind1= new Mastermind();
		Joueur joueur=new Joueur();
		
		System.out.println("Lancement du jeu");
		
		
		List maList = mastermind1.CreerListeCouleur();
		List listeMelange =mastermind1.listeAleatoire(maList);
		List listeJoueur= joueur.createListJoueur();
		System.out.println("Votre combinaison: "+listeJoueur);
		
		
		// voulez vous changer la liste oui non 
		//comparer les deux listes dans une boucle for avant d'afficher listeMelange
		// listeJoueur.modifierUnecouleur();
		
		System.out.println("La combinaison à trouver était: " +listeMelange);
		
	}


	
	}

