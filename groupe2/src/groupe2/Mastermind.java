package groupe2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mastermind<listeDeCouleur> {
	
	private List<String> listeDeCouleur = new ArrayList<String>();
	private List <String> listeJoueur = new ArrayList<String>();


	


	public Mastermind(List<String> listeDeCouleur, List<String> listeJoueur) {
		this.listeDeCouleur = listeDeCouleur;
		this.listeJoueur = listeJoueur;
	}
	


	public List<String> getListeDeCouleur() {
		return listeDeCouleur;
	}



	public void setListeDeCouleur(List<String> listeDeCouleur) {
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



	public List<String> getListeJoueur() {
		return listeJoueur;
	}



	public List<String> setListeJoueur(List<String> listeJoueur) {
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


List<String> CouleurPossible = new List<> {"Noir";"Jaune";"";""};

public List<String> listaleacreation 
for (i=0;i<4;i++)
	int rand = rand.alea()

	List<String> CreerListeCouleur() {
		 
		String couleurNoir= new String ("noir");
		String couleurJaune= new String ("jaune");
		String couleurRouge= new String("rouge");
		String couleurBleu= new String("bleu");
		
		
		listeDeCouleur.add(couleurNoir);
		listeDeCouleur.add(couleurJaune);
		listeDeCouleur.add(couleurRouge);
		listeDeCouleur.add(couleurBleu);
		
		
		
		
		 return listeDeCouleur;
		 
		
	}
				
				
	List<String> listeAleatoire(List<String> liste){
		Collections.shuffle(liste);
		return liste;
		
	}
public List createListJoueur(){
		
	
		
	
		
		
		
		}
}
