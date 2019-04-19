package groupe2;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.Scanner;




	public class Mastermind {

		private ArrayList <Integer> hasard = new ArrayList<Integer>();
		private ArrayList <String> listeJoueur = new ArrayList<String>();
		

		public Mastermind() {
			

			createList();
			creationListeJoueur();
			}
		
		public ArrayList<String> getListeJoueur() {
			return listeJoueur;
		}



				
		public List<Integer> getHasard() {
			return hasard;
		}

		public void setHasard(ArrayList<Integer> hasard) {
			this.hasard = hasard;
		}

		public  List<String> creationListeJoueur(){
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
		
		
		
		
		public void createList(){
			for( int i=0;i<4;i++){

				int indiceAuHasard = (int) (Math.random()*(Colors.values().length+1)-1);
				hasard.add(new Integer(indiceAuHasard));
				
			}
		}

		public String toString(int numeroDelist) {
			String r = "";
			String j ="";
			for (Integer i: hasard) {
				r += Colors.values()[i] +"," ;
			}
			if (numeroDelist == 0) {
				return r;
			}
			else if(numeroDelist ==1) {
				return "Votre combinaison est :" + listeJoueur;
			}
					
			else {
				return "ERREUR";
			}
			
		}



			

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static void main(String [] args){
			Mastermind m1= new Mastermind();
			System.out.println(m1);
			}
	}

