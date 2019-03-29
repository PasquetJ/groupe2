package groupe2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mastermind<listeDeCouleur> {

	
	public Mastermind() {
		
		
	}
	
	 List<String> CreerListeCouleur() {
		 
		List<String> listeDeCouleur= new ArrayList<String>();
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
	public ArrayList <Integer> comparaisonDeliste (ArrayList <String>listeDeCouleur, ArrayList <String>listeMelange){
	
	ArrayList<Integer> tableauResultat = new ArrayList<Integer>() ;
	
			for (int i=0;i<4;i++) {
				int iterateurBonneRep= (Integer) null;
				int iterateurMauvaiseRep=(Integer) null;
				int iterateurAbsent=(Integer) null;
				
			
				
					
			}return (tableauResultat);
	}
				
				
	List<String> listeAleatoire(List<String> liste){
		Collections.shuffle(liste);
		return liste;
		
	}
}
