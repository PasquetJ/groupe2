package groupe2;
import java.util.List;

public class LancementJeu {

	public static void main(String[] args) {
		
		Mastermind mastermind1= new Mastermind();
		Joueur joueur1=new Joueur();
		
		System.out.println("Lancement du jeu");
		
		List maList = mastermind1.CreerListeCouleur();
		List listeMelange =mastermind1.listeAleatoire(maList);
		List listeJoueur= joueur1.createListJoueur();
		System.out.println(listeJoueur);
		// voulez vous changer la liste oui non 
		//comparer les deux listes dans une boucle for avant d'afficher listeMelange
		// listeJoueur.modifierUnecouleur();
		
		System.out.println(listeMelange);
	}

}
