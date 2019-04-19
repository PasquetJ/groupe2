package groupe2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public   class  Comparaison {
	
	public Comparaison(){
		
	}
	
	
		
	
		
		public String comparaison (ArrayList<String> listJoueur, String stringAleatoire) {
			boolean[] utilise={false,false,false,false};
			String [] resultat={"Existe pas","Existe pas","Existe pas","Existe pas"};
			
			
			
			String[] tabAleatoire = stringAleatoire.split(",");
			ArrayList<String> listAleatoire = new ArrayList<String>();
			
			for (int l =0 ; l<tabAleatoire.length;l++) {
				listAleatoire.add(tabAleatoire[l]);
			}

		
			for (int i=0; i<4; i++){
			if(listJoueur.get(i).compareTo(listAleatoire.get(i))==0){
			resultat[i]="Bien Place";
			utilise[i]= true;
			
			}
		}
		
		
		for (int i=0; i<4; i++){
			if(resultat[i]=="Existe pas"){
			for (int j=0; j<4; j++){
				if(listJoueur.get(i).equals(listAleatoire.get(j)) && !utilise[j]){
					resultat[i]="Mal place";
					utilise[j]=true;
				}
			}
		}
				}
		

	return Arrays.toString(resultat);

		}
	
	
	
	
	
}
