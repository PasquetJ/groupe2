package groupe2;

import java.util.ArrayList;
import java.util.List;


public class Mastermind {

	private List <Integer> hasard = new ArrayList<Integer>();
	
	
		
	public Mastermind() {

		createList();
	}
	
	public void createList(){
		for( int i=0;i<4;i++){

			
			int indiceAuHasard = (int) (Math.random()*(Colors.values().length+1)-1);
			hasard.add(new Integer(indiceAuHasard));
			//String value = combi.get(1);
			
		}
	}

	public String toString() {
		String r = "";
		for (Integer i : hasard) {
			r += Colors.values()[i] + ", ";
		}
		return r;
	}
	
	public static void main(String [] args){
		Mastermind m1= new Mastermind();
		System.out.println(m1);
		
		
	}
}
