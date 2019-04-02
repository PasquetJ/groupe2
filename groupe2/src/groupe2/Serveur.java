package groupe2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Serveur extends Thread{
	
	public Serveur(String partie) {
		super(partie);
		
	}
	
	public void run() {
		for(int i=0; i<5; i++)
			System.out.println(this.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] zero) {
		
		ServerSocket socketserver  ;
		Socket socketduserveur ;
		BufferedReader in;
		PrintWriter out;
		
		Serveur s=new Serveur("t");
		s.start();
		
		try {
		
			socketserver = new ServerSocket(2015);
			System.out.println("Connectez-vous!");
			socketduserveur = socketserver.accept(); 
		        System.out.println("Un joueur s'est connecté");
			out = new PrintWriter(socketduserveur.getOutputStream());
		        out.println("Vous êtes connecté !");
		        out.flush();
		                
		        socketduserveur.close();
		        socketserver.close();
		        
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}


