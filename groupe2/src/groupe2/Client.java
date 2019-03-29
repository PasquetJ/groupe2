package groupe2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Client {
	
	private List <String> combinaison = new ArrayList<String>();
	
	public Client(){
		createList();
	}
	public void createList(){
		Scanner couleur  = new Scanner(System.in);
		for( int i=0;i<4;i++){
		
			System.out.print("Veuillez saisir une couleur entre le bleu,rouge,jaune,noir: ");
			String tmp =couleur.nextLine();
			if (tmp.compareTo("rouge")!=0 && tmp.compareTo("bleu")!=0 && tmp.compareTo("jaune")!=0 && tmp.compareTo("noir")!=0 && tmp.compareTo(" ")!=0){
				System.out.println("Erreur de couleur!");
				i--;
			}
			else
				
			combinaison.add(tmp);
		}
		}
		public String toString(){
			String c="";
			for (int i=0; i<4; i++) {
				combinaison.get(i);
				c+=combinaison.get(i) + " , ";
			}
			return c;
				
		}
		

	
	public static void main(String[] zero) {
		
		
		Socket socket;
		BufferedReader in;
		
		Client c1= new Client();


		try {
		
			socket = new Socket(InetAddress.getLocalHost(),2019);	
		        System.out.println("Demande de connexion");

		        in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		        String message_distant = in.readLine();
		        System.out.println(message_distant);
		        
		        socket.close();
		        
		        
		       
		       
		}catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
