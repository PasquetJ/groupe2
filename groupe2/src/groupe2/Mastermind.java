package groupe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Mastermind {
	private String a;
	private String b;
	private String c;
	private String d;
	private List <String> combi = new ArrayList<String>();
	private List <String> hasard = new ArrayList<String>();
	
	
		
	public Mastermind(String a, String b, String c, String d) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		
	}
	
	public Mastermind(List<String> combi){
		for( int i=0;i<combi.size();i++){
			//int nbrRandom = Math.random() * ( (comb.size())-1 - 0);
			//combi.add(couleurpossible[nbrRandom];
			combi.add(a);
			combi.add(b);
			combi.add(c);
			combi.add(d);
			
			int indiceAuHasard = (int )(Math.random()*combi.size()-1);
			//hasard.add(indiceAuHasard);
			String value = combi.get(1);
			System.out.println(value);
		}}	

	
	public static void main(String [] args){
		//String [] combi= "bleu rouge noir jaune".split(" ");
		//System.out.println(combi);
		Mastermind m1= new Mastermind("bleu", "rouge","noir","jaune");
		System.out.println(m1);
		//return combi.index[0];
		//System.out.println("Position 1: "+ combi.get(1));
		
	}
}
