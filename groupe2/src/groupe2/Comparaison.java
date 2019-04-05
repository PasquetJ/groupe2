package groupe2;

import java.util.ArrayList;
import java.util.List;

public class Comparaison extends LancementJeu {
	
	public Comparaison(listeJoueur, listeMelange) {
		
		/*for (i=0;i<4; i++) {
		Object listeJoueur;
		if (listeJoueur[i]!=listeMelange[i]) {
				for (j=0; i<4;i++) {
					if( listeMelange[j].containslisteJoueur[i])
						System.out.println("mal placé");
					else 
						System.out.println("existe pas");
				}
		else
			System.out.println("bien placé");*/
		
		ArrayList<String> listeComparaison= new ArrayList<String>();
        for (String temp : listeJoueur)
            listeComparaison.add(listeMelange.contains(temp) ? "0" : "*");
        System.out.println(listeComparaison);
}
}
//}
//}