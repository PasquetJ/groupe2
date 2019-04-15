package groupe2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public final  class  Comparaison {
	
	
	public  Comparaison () {
		
	}
	
	public static String bienPlace (ArrayList<String> listJoueur, String stringAleatoire) {
		ArrayList <String> listeComparaison = new ArrayList<String>();
		
		String[] tabAleatoire = stringAleatoire.split(",");
			ArrayList<String> listAleatoire = new ArrayList<String>();
			
			
			for (int i=0;i<4;i++) {
				String tmp = listJoueur.get(i);
				String nbr1 = "";
				
			
				if(tmp.compareTo(listAleatoire.get(i))==0) {
					nbr1+="1";
					
						
				}
				else {}
				return nbr1;
				}
			
			/*for (int l =0 ; l<tabAleatoire.length;l++) {
				listAleatoire.add(tabAleatoire[l]);
			}
		
		for (int i=0;i<4;i++) {
			String tmp = listJoueur.get(i);
		
			if(tmp.compareTo(listAleatoire.get(i))==0) {
				message ="Bien placé";
				
			}
			else {
				
				for (int j = i+1;j<4;j++) {
					if (tmp.compareTo(listAleatoire.get(j))==0){
					message ="Mal placé";
					
				}
					else {
						message ="n'existe pas";
						
					}
				listeComparaison.add(message);
				}
				listeComparaison.add(message);
			}
			
		}
		
		return listeComparaison;
		}
	*/
	
	
	
	}
	
	

}
