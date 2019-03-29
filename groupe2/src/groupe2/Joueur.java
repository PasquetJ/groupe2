package groupe2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Joueur {
 

	public Joueur() {
	
		//ListeJoeur
	}
	
	
	
	public List createListJoueur(){
		
		List <String> listeJoueur = new ArrayList<String>();
		
		Scanner couleur  = new Scanner(System.in);
		
		for( int i=0;i<4;i++){
			
			System.out.print("Veuillez saisir une couleur entre le bleu,rouge,jaune,noir: ");
			String tmp =couleur.nextLine();
			if (tmp.compareTo("rouge")!=0 && tmp.compareTo("bleu")!=0 && tmp.compareTo("jaune")!=0 && tmp.compareTo("noir")!=0 && tmp.compareTo(" ")!=0){
				System.out.println("Erreur de couleur!");	
				i--;
			}
			else
					
				listeJoueur.add(tmp);
			}
		return listeJoueur;
		}
	
	
	/*	public String toString(){
				String c="";
				for (int i=0; i<4; i++) {
					combinaison.get(i);
					c+=combinaison.get(i) + " , ";
				}
				return c;
					
			}*/
	}

