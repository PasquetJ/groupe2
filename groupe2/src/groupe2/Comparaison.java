package groupe2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public final  class  Comparaison {
	private int nbr1;
	private int nbr2;
	static ArrayList <String> newListJoueur= new ArrayList<String>();
	static ArrayList <String> newListAleatoire = new ArrayList<String>();
	
	public  Comparaison (/*ArrayList<String> listJoueur, String stringAleatoire*/) {
		//bienPlace(listJoueur, stringAleatoire);
		
	}
	
		






public static int  bienPlace (ArrayList<String> listJoueur, String stringAleatoire) {
	String[] tabAleatoire = stringAleatoire.split(",");
	ArrayList<String> listAleatoire = new ArrayList<String>();
	
	for (int l =0 ; l<tabAleatoire.length;l++) {
		listAleatoire.add(tabAleatoire[l]);
	}
		int nbr1 =0;
		
		for (int j=0;j<4;j++) {
			String tmp = listJoueur.get(j);
			if(tmp.compareTo(listAleatoire.get(j))==0) {
				nbr1++;
				//listJoueur.remove(j);
				//listAleatoire.remove(j);
				
					
			}
			else {
				newListJoueur.add(listJoueur.get(j));
				newListAleatoire.add(listAleatoire.get(j));
				//System.out.println(newListAleatoire);
				//System.out.println(newListJoueur);
			}
			
			
			}
		
		return nbr1;
		
}
	public static int malPlace (ArrayList<String> newListJoueur, ArrayList< String> newListAleatoire) {
		
		int nbr2 = 0;
		for (int i=0;i< newListJoueur.size();i++) {
			String tmp = newListJoueur.get(i);
			for(int n=i++;n< newListJoueur.size(); i++) {
				
			if(tmp.compareTo(newListAleatoire.get(n))==0) {
				nbr2++;
				
				
					
			}
			else {}
			
			
			}
		}
		
		return nbr2;
}
		
		
		
		
}

/*public String toString() {
	String message="";
		message="Vous avez "+ nbr1 +" couleur(s) bien placée(s) "+"et la nouvelle liste aleatoire est: "+newListAleatoire;//+" et "+ nbr2+" couleur(s) mal placée(s)";
		return message;
	}*/
